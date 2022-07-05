package com.bridgelabz.functional;

import java.util.Scanner;

public class SumOfThreeIntegerAddsToZero {
    static Scanner sc = new Scanner(System.in);
    static void sum0count(int n) {
        int[] arr = new int[n];
        int count = 0;
        System.out.println("enter values");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        count++;
                        System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "=" + "0");
                    }
                }
            }
        }

        // output
        System.out.println("total pairs are " + count);

    }

    public static void main(String[] args) {

        System.out.println("enter no of inputs");
        int n = sc.nextInt();
        sum0count(n);

    }
}