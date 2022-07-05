package com.bridgelabz.BasicCorePgms;

import java.util.Scanner;

public class PowerOfTwo {

        public static void main(String[] args) {
            int num = 2;
            int N;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the power: ");
            N = sc.nextInt();
            for(int i=1; i<=N; i++){
                System.out.println("2^" + i + ": " + (int)Math.pow(num , i));
            }
            double powerValue = (double)Math.pow(num , N);
            System.out.println(num + " to the power of " + N + " is " + powerValue);
        }
    }