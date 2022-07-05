package com.bridgelabz.BasicCorePgms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String args[]) {
        int N;
        double nthHarmonicValue = 1;
        System.out.print("Enter Nth Harmonic number: ");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        System.out.printf("The %dth harmonic series: ",N);
        System.out.print("1");

        for(int i=2; i<=N; i++){
            System.out.print(" + 1/"+i);
            nthHarmonicValue += (double)1/i;
        }

        System.out.printf("\nThe %dth harmonic value H%d: ",N,N);
        System.out.println(nthHarmonicValue);
    }
}
