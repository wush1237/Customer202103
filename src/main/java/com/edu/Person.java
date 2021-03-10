package com.edu;

public class Person {
    String cusnum;
    int count;
    int discount;

    public Person(String cusnum,int count,int discount) {
        this.cusnum = cusnum;
        this.count = count;
        this.discount = discount;
    }



    public void print(){
        System.out.println(cusnum + "\t" + count + "\t" + discount + "\t" + (count-discount));

    }
}
