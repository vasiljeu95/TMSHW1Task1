package com.stepan.idea;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        if (num != 0) {
            if (Math.abs(num) < 10) {
                System.out.println("this is a single digit number");
            } else if (Math.abs(num) < 100) {
                System.out.println("this is a two-digit number");
            } else if (Math.abs(num) < 1000) {
                System.out.println("this is a three-digit number");
            }

            if (num < 0) {
                System.out.println("this is a negative number");
            } else if (num > 0) {
                System.out.println("this is a positive number");
            }

            String number = Double.toString(Math.abs(num));
            int n = number.length();
            System.out.println(n-2);
        } else {
            System.out.println("ERROR, number = 0 !!!");
        }
    }
}
