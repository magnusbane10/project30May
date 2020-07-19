package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            int x = 5 / 0;
        } catch (Exception e) {
            System.out.println("nu poti imparti la 0");
        }finally {
            System.out.println("this will be printed no matter what the value of y is");
        }
        System.out.println("end of program");
    }
}