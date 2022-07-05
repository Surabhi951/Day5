package com.bridgelabz.BasicCorePgms;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args){
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The prime factors are:");
        for(int i=2; i<=num; i++){
            while(num%i==0){
                System.out.println(i);
                num = num/i;
            }
        }
    }
}
