package com.ntl.interview.leetcode;

public class _141_LinkedListCycle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public boolean hasCycle(ListNode head) {

            if (head == null || head.next == null) {
                return false;
            }

            int STEP_MAX = 2;
            ListNode slow = head;
            ListNode fast = head.next;

            while (slow != null) {
                int count = 0;
                slow = slow.next;

                while (fast != null) {
                    if (fast == slow) {
                        return true;
                    }
                    fast = fast.next;
                    count++;
                    if (count == STEP_MAX) {
                        break;
                    }
                }
            }

            return false;
        }
    }
}
