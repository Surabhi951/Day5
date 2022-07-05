package com.bridgelabz.BasicCorePgms;

import java.util.Scanner;

public class ComputeQuotientReminder {
    public static void main(String[] args){
        int divisor;
        int divident;
        int quotient;
        int reminder;
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        divisor = sc.nextInt();
        divident = sc.nextInt();

        quotient = divident / divisor;
        reminder = divident % divisor;
        System.out.println("Quotient:" +quotient);
        System.out.println("Reminder:" +reminder);

    }
}
