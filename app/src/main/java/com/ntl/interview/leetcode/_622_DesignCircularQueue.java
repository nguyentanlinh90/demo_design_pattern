package com.ntl.interview.leetcode;

public class _622_DesignCircularQueue {

    static class MyCircularQueue {

        int[] arr;
        int SIZE;
        int headIndex;
        int tailIndex;
        int count; // current number of elements

        public MyCircularQueue(int k) {
            SIZE = k;
            arr = new int[SIZE];
            headIndex = tailIndex = -1;
            count = 0;
        }

        //Insert an element into the circular queue. Return true if the operation is successful
        public boolean enQueue(int value) {
            if (isFull() == true) return false;

            tailIndex++;
            if (tailIndex == SIZE) tailIndex = 0;
            if (isEmpty() == true) headIndex = tailIndex;
            arr[tailIndex] = value;
            count++;
            return true;

        }

        //Delete an element into the circular queue. Return true if the operation is successful
        public boolean deQueue() {
            if (isEmpty() == true) return false;
            headIndex++;
            if (headIndex == SIZE) headIndex = 0;
            count--;
            return true;
        }

        //Get the head item
        public int Front() {
            return isEmpty() ? -1 : arr[headIndex];
        }

        //Get the last item
        public int Rear() {
            return isEmpty() ? -1 : arr[tailIndex];
        }

        //Check whether the circular queue is empty  or not
        public boolean isEmpty() {
            return count <= 0;
        }

        //Check whether the circular queue is full or not
        public boolean isFull() {
            return count >= SIZE;
        }
    }

    public static void main(String[] args) {
        MyCircularQueue myQueue = new MyCircularQueue(3);
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.deQueue();
        myQueue.enQueue(4);
    }
}
