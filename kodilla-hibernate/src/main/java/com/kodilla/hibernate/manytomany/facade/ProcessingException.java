package com.kodilla.hibernate.manytomany.facade;

public class ProcessingException extends Exception {

    public static String ERR_FIND_COMPANY = "Company not finded";
    public static String ERR_FIND_EMPLOYEE = "Employee not finded";


    public ProcessingException(String message) {
        super(message);
    }
}
