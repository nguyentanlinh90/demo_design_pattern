package com.ntl.interview.leetcode;

public class FindNumberswithEvenNumberofDigits1295 {

    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

    public static int findNumbers(int[] nums) {

        int bienDem = 0;
        for (int num : nums) {
            int soLuongChuSo = timSoLuongChuSo(num);
            if (soLuongChuSo % 2 == 0) {
                bienDem++;
            }
        }
        return bienDem;
    }

    public static int timSoLuongChuSo(int num) {
        int bienDem = 0;
        int kq = num;
        while (kq != 0) {
            kq = num/10;
            num = kq;
            bienDem++;
        }
        return bienDem;
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

}
