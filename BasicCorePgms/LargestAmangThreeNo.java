package com.bridgelabz.BasicCorePgms;

import java.util.Scanner;

public class LargestAmangThreeNo {
    public static void main(String[] args) {
        System.out.println("Enter three number");
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();

        if(a > b){
            System.out.println("a is largest number than among");
        }
        else if (b > c) {
            System.out.println("b is largest number than among");
        }
        else{
            System.out.println("c is largest number than among");
        }
    }
}
