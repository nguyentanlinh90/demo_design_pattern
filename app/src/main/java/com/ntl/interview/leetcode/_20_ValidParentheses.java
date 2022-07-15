package com.ntl.interview.leetcode;

public class _20_ValidParentheses {

    public static void main(String[] args) {
        String s = "]){}";
        System.out.println(isValid(s));
    }

    static class MyStack {
        class Node {
            Node next;
            char value;

            public Node(char v) {
                value = v;
                next = null;
            }
        }

        Node topNode;

        public void push(char value) {
            Node newNode = new Node(value);
            if (!isEmpty()) {
                newNode.next = topNode;
            }
            topNode = newNode;

        }

        public char pop() {
            char value = topNode.value;
            topNode = topNode.next;
            return value;
        }

        public boolean isEmpty() {
            return topNode == null;
        }
    }

    static public boolean isValid(String s) {
        MyStack myStack = new MyStack();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char curChar = s.charAt(i);
            if (curChar == '(' || curChar == '[' || curChar == '{') {
                myStack.push(curChar);
            } else {
                if (myStack.isEmpty()) return false;
                char preChar = myStack.pop();

                if ((preChar == '(' && curChar == ')')
                        || (preChar == '[' && curChar == ']')
                        || (preChar == '{' && curChar == '}')) {
                    //ok
                } else {
                    return false;
                }
            }
        }
        return myStack.isEmpty();
    }
}
