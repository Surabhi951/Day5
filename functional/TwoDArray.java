package com.bridgelabz.functional;

import java.io.PrintWriter;
import java.util.Scanner;
    public class TwoDArray {
        static Scanner sc = new Scanner(System.in);
        public static int[][] arrayInt(int m, int n) {
            int[][] arr = new int[m][n];
            System.out.println();
            System.out.println("Integer Array");

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();

                }
            }
            return arr;
        }

        public static void display(int[][] arr, int m, int n){
            PrintWriter pw = new PrintWriter(System.out);
            System.out.println();
            pw.println("2D Array Integer");

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    pw.print("\n" + arr[i][j] + " ");
                }
                pw.print("\n");
            }

        }


        public static void main(String[] args){
            System.out.println("Enter number of rows");
            int m = sc.nextInt();
            System.out.println("Enter number of columns");
            int n = sc.nextInt();

            int arr[][] = arrayInt(m, n);
            display(arr, m, n);

        }
    }


