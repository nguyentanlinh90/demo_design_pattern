package com.ntl.interview.leetcode;

public class _387_FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";
        System.out.println(firstUniqChar(s1)); // 0
        System.out.println(firstUniqChar(s2)); // 2
        System.out.println(firstUniqChar(s3)); // -1
    }

    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[123];
        for (char c : arr) {
            int index = (int) c;
            count[index]++;
        }

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int) c;
            if (count[index] == 1) {
                return i;
            }
        }

        return -1;
    }
}
