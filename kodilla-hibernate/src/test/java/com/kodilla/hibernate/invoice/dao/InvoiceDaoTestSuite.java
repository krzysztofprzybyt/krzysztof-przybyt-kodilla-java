package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    private List<Item> items = new ArrayList<>();

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Invoice invoice = new Invoice("2018.01/1/LD");

        Item item = new Item( new BigDecimal(100),20,new BigDecimal(15));
        Item item2 = new Item( new BigDecimal(200),30,new BigDecimal(115));
        Item item3 = new Item( new BigDecimal(1200),32,new BigDecimal(30));

        Product product = new Product("Apple");
        Product product2 = new Product("Potato");

        item.setProduct(product);
        item2.setProduct(product);
        item3.setProduct(product2);

        item.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        items.add(item);
        items.add(item2);
        items.add(item3);

        invoice.setItems(items);

        productDao.save(product);
        productDao.save(product2);
        int productId1 = product.getId();
        int productId2 = product2.getId();

        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        itemDao.save(item);
        itemDao.save(item2);
        itemDao.save(item3);
        int itemId = item.getId();
        int itemId2 = item2.getId();
        int itemId3 = item3.getId();

        //When
        int positions = invoice.getItems().size();

        //Then
        Assert.assertEquals(3, positions);

        //CleanUp
        try {
            productDao.delete(productId1);
            productDao.delete(productId2);
            invoiceDao.delete(invoiceId);
            itemDao.delete(itemId);
            itemDao.delete(itemId2);
            itemDao.delete(itemId3);
        } catch (Exception e) {
            //do nothing
        }

    }
}
