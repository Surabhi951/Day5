package com.bridgelabz.functional;

import java.util.Scanner;

public class Quadratic {
     static void roots(int a, int b, int c){
        int delta = Math.abs(b*b - 4*a*c);
        double x1 = (-b + Math.pow(delta, 1/2)) / (2*a);
        double x2 = (-b - Math.pow(delta, 1/2)) / (2*a);
        System.out.println(x1);
        System.out.println(x2);
    }
    public static void main(String[] args){
         double x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();

        System.out.println("Enter value of b");
        int b = sc.nextInt();

        System.out.println("Enter value of c");
        int c = sc.nextInt();
        roots(a , b , c);
    }
}
