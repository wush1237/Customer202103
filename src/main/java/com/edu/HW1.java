package com.edu;

public class HW1 {
    public static void main(String[] args) {
        Person[] customers = {
                new Person("0013", 490,0),
                new Person("0052", 1000, 100),
                new Person("0081", 290, 0),
                new Person("2122", 2000, 200)
        };

        for (int i = 0; i < customers.length; i++) {
            customers[i].print();
        }
    }
}
