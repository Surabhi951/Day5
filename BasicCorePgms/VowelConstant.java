package com.bridgelabz.BasicCorePgms;

import java.util.Scanner;

public class VowelConstant {
    public static void main(String[] args) {
        System.out.println("Enter any Alphabet");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
            System.out.println(ch +  ":is vowel");
        }
            else{
            System.out.println(ch +  ":is constant");
        }
    }
}
