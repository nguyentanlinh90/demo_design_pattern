package com.ntl.interview.leetcode;

public class _1672_RichestCustomerWealth {

    public static int maximumWealth(int[][] a) {
        int soKhachHang = a.length;
        int soNganHang = a[0].length;
        int max = 0;

        for (int i = 0; i < soKhachHang; i++) {
            int taiSanKhachHangI = 0;
            for (int j = 0; j < soNganHang; j++) {
                taiSanKhachHangI += a[i][j];
            }
            if (taiSanKhachHangI > max) {
                max = taiSanKhachHangI;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {3, 2, 1}};
        int[][] b = new int[2][3];
        int[][] c = {{1, 5}, {7, 3}, {3, 5}};
        int[][] d = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};

        /*int soDong = a.length; //2
        int soCot = a[0].length; //3

        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }*/

        System.out.println(maximumWealth(d));
    }
}
