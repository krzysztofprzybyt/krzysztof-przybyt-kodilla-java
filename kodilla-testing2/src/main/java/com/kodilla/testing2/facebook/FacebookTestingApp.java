package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_WAIT_FOR = "//div[contains(@class, \"5k_5\")]";
    public static final String XPATH_DAY = "//div[contains(@class, \"5k_5\")]/span/span/select[contains(@id, \"day\")]";
    public static final String XPATH_MONTH = "//div[contains(@class, \"5k_5\")]/span/span/select[contains(@id, \"month\")]";
    public static final String XPATH_YEAR = "//div[contains(@class, \"5k_5\")]/span/span/select[contains(@id, \"year\")]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectDay = driver.findElement(By.xpath((XPATH_DAY)));
        Select day = new Select(selectDay);
        day.selectByValue("4");

        WebElement selectMonth = driver.findElement(By.xpath((XPATH_MONTH)));
        Select month = new Select(selectMonth);
        month.selectByValue("11");

        WebElement selectYear = driver.findElement(By.xpath((XPATH_YEAR)));
        Select year = new Select(selectYear);
        year.selectByValue("1978");
    }
}
