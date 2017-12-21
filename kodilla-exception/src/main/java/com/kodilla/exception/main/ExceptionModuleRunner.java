package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.io.IOException;

public class ExceptionModuleRunner {
    public static void main(String args[]){

        FileReaderWithoutHandling fileReaderWH = new FileReaderWithoutHandling();
        try {
            fileReaderWH.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading file!");
        }

    }
}
