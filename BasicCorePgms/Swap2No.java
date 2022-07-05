package com.bridgelabz.BasicCorePgms;

import java.util.Scanner;

public class Swap2No {
    public static void main(String[] args) {
        int a;
        int b;
        int swap;
        System.out.println("Enter the value of a and b");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("before swapping of two nos:" + a + " " + b);
        swap = a;
        a = b;
        b = swap;
        System.out.println("after swapping of two nos:" + a + " " + b);
        System.out.println();
    }
}
