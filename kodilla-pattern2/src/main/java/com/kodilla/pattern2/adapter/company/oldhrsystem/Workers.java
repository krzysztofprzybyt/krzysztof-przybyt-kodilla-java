package com.kodilla.pattern2.adapter.company.oldhrsystem;

public class Workers {
    private String [][] workers = {
            {"67112345654", "John", "Smith"},
            {"62012495874", "Ivone", "Novak"},
            {"75020154788", "Jessie", "Pinkman"},
            {"75010257893", "Walter", "White"},
            {"75073056987", "Clara", "Larson"}
    };
    private double[] salaries = {
            4500.00,
            3700.00,
            6850.00,
            2900.00,
            9900.00
    };

    public String getWorker(int n) {
        if(n>salaries.length) {
            return "";
        }
        return workers[n][0]+", "+workers[n][1]+", "+workers[n][2]+", "+ salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
