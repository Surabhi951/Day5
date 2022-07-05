package com.bridgelabz.functional;

import java.util.Scanner;

public class WindChill {
     static void windchill(double f , double ws) {
         double w = 35.74 + 0.6215 * f + (0.4275 * f - 35.75) * Math.pow(ws, 0.16);
         System.out.println(w);
     }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter temperature in fahrenheit");
         double f = sc.nextDouble();
         System.out.println("Enter wind speed in miles per hour");
         double ws = sc.nextDouble();

         if (Math.abs(f) > 50 || ws > 120 || ws < 3) {
             System.out.println("enter correct input");
         } else {
             windchill(f, ws);
         }
     }
}
