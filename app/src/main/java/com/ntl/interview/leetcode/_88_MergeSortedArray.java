package com.ntl.interview.leetcode;

import java.util.Arrays;

public class _88_MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        int[] merge = merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(merge));

    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int x : nums2) {
            chenPhanTuVaoMang(x, nums1, m);
            m++;
        }
        return nums1;
    }

    private static void chenPhanTuVaoMang(int x, int[] nums1, int m) {
        boolean timDuocK = false;
        for (int k = 0; k < m; k++) {

            if (nums1[k] > x) {
                timDuocK = true;
                for (int i = m - 1; i >= k; i--) {
                    nums1[i + 1] = nums1[i];
                }
                nums1[k] = x;
                break;
            }
            nums1[m] = x;
        }
    }
}
