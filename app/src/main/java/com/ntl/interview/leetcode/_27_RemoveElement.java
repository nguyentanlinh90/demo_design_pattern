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

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;

        System.out.println(removeElement(nums, val));
    }
}
