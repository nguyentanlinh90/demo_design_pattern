package com.ntl.interview.leetcode;

public class Sorting {
    public static void main(String[] args) {
        int[] a = {5, 3, 2, 7, 8, 1, 2};
        int[] b = {1, 2, 3, 4, 5, 7, 6};
//        bubbleSort(b);
//        insertionSort(a);
        selectionSort(a);
    }

    public static void printArray(int no, int[] a) {
        System.out.printf("%d: ", no);
        for (int j : a) {
            System.out.printf("%d ", j);
        }
        System.out.println();
    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
            if (isSorted) break;
            printArray(i, a);
        }
    }

    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int ai = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > ai) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = ai;
            printArray(i, a);
        }
    }

    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = 0;
            for (int j = i; j < n; j++) {
                //tim min [i, n]
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int t = a[i];
                a[i] = a[minIndex];
                a[minIndex] = t;
            }
            printArray(i, a);
        }
    }
}
