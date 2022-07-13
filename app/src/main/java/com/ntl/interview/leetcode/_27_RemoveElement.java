package com.ntl.interview.leetcode;

public class _27_RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n;) { //khong viet i++
            if (nums[i] == val) {
                //xoa
                for (int j = i; j <= n - 2; j++) {
                    nums[j] = nums[j+1];
                }
                n--;
            } else  {
                //khong xoa
                i++;
            }
        }

        return n;
    }

    public static int removeElementSuDung2ConTro(int[] a, int x) {
        int k = 0;
        for (int i = 0; i <a.length; i++) {
            if (a[i] != x) {
                a[k] = a[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int[] nums1 = {0,1,2,2,3,0,4,2};
        int val = 3;
        int val1 = 2;

        System.out.println(removeElement(nums1, val1));
    }
}
