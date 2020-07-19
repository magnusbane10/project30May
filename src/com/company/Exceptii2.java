package com.company;

import java.util.Scanner;

public class Exceptii2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String input;
            input = scanner.nextLine();
            if (input.equals("Hello")) {
                System.out.println("Hey! That is not a value");
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
