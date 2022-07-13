package com.ntl.interview.leetcode;

public class DeQui {
    public static void main(String[] args) {
//        System.out.println(Fibonacy2(10));
        Fibonacy3(10);
        //System.out.println(Fibonacy(9));
        //printFibonacy(8);
        //printFibonacy(10);
        //printElementFromIndexToN(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 0);
    }

    public static int GiaiThua(int n) {
        if (n == 0) return 1;
        return n * GiaiThua(n - 1);
    }

    public static int Fibonacy(int n) {
        // 1. bai toan co so
        System.out.println("Can tinh F[" + n + "]");
        if (n <= 2) return 1;

        // 2. cong thuc quy nap
        return Fibonacy(n - 1) + Fibonacy(n - 2);
    }

    //toi uu -> de quy co nho'
    static int[] F = new int[1000];

    public static int Fibonacy2(int n) {
        if (F[n] != 0) return F[n];
        System.out.println("Can tinh F[" + n + "]");

        if (n <= 2) {
            F[1] = 1;
            F[2] = 1;
            return 1;
        }
        F[n] = Fibonacy2(n - 1) + Fibonacy2(n - 2);
        return F[n];
    }

    //khu de quy -> ko dung de quy
    public static void Fibonacy3(int n) {
        int[] F = new int[11];
        F[1] = 1;
        F[2] = 1;
        for (int i = 3; i <= 10; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
        System.out.println(F[10]);

    }

    public static void printFibonacy(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(Fibonacy(i));
        }
    }

    public static void printElementFromIndexToN(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            return;
        }
        System.out.println(arr[index]);
        printElementFromIndexToN(arr, index + 1);
    }

    public static void printElementFromNNegative1To0(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            return;
        }
        printElementFromIndexToN(arr, index + 1);
        System.out.println(arr[index]);

    }
}
