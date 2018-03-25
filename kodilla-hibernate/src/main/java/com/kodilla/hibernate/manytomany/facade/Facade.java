package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public List<Employee> findUserbyName(String name) throws ProcessingException{

        List<Employee> employeeList = employeeDao.retrieveEmployeesForNameLikes("%"+name+"%");
        LOGGER.info("Finding Employee by: "+name);

        if(employeeList.isEmpty()) {

            LOGGER.error(ProcessingException.ERR_FIND_EMPLOYEE);
            throw new ProcessingException(ProcessingException.ERR_FIND_EMPLOYEE);
        } else {

            LOGGER.info("Finded Employees");
            return employeeList;
        }
    }
    public List<Company> findCompanybyName(String name) throws ProcessingException{

        List<Company> companyList = companyDao.retrieveCompanyForSomeLetters("%"+name+"%");
        LOGGER.info("Finding Companies by: "+name);

        if(companyList==null) {

            LOGGER.error(ProcessingException.ERR_FIND_COMPANY);
            throw new ProcessingException(ProcessingException.ERR_FIND_COMPANY);
        } else {

            LOGGER.info("Finded Companies");
            return companyList;

        }


    }
}
