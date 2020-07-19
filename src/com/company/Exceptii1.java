package com.company;

import java.util.Scanner;

public class Exceptii1 {
    public static void main(String[] args) {
        //int input;
        Scanner scanner = new Scanner(System.in);

        try {
            int input;
            input = scanner.nextInt();
            if (input > 0) {
                System.out.println(input);
            }else {
                throw new Exception("Wrong input");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("try again");
        }


    }
}
