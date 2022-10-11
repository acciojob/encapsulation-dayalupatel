package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
        rw.name = "David";
        System.out.println(rw.name);

        rw.setName("John");
        String name = rw.getName();
        System.out.println(name);
    }
}