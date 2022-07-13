package com.ntl.interview.leetcode;

public class _1662_CheckIfTwoStringArraysAreEquivalent {

    public static boolean arrayStringsAreEqual(String[] s1, String[] s2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String s : s1) {
            sb1.append(s);
        }

        for (String s : s2) {
            sb2.append(s);
        }
        return sb1.toString().equals(sb1.toString());
    }

    public static void main(String[] args) {
        String[] s1 = {"ab", "c"};
        String[] s2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(s1, s2)); // true
    }
}
