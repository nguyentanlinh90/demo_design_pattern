package com.ntl.interview.leetcode;

public class _707_DesignLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.printList();

        myLinkedList.addAtTail(3);
        myLinkedList.printList();

        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
        myLinkedList.printList();

        myLinkedList.get(1);              // return 2
        myLinkedList.printList();

        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
        myLinkedList.printList();

        myLinkedList.get(1);
        myLinkedList.printList();
    }

    public static class SinglyListNode {
        int val;
        SinglyListNode next;

        SinglyListNode(int val) {
            this.val = val;
        }
    }

    static class MyLinkedList {
        private SinglyListNode head;

        public MyLinkedList() {
            head = null;
        }

        public int get(int index) {
            SinglyListNode tempNode = head;
            int count = 0;
            while (tempNode != null) {
                if (count == index) {
                    return tempNode.val;
                }
                count++;
                tempNode = tempNode.next;
            }

            return -1;
        }

        public void addAtHead(int val) {
            SinglyListNode newNode = new SinglyListNode(val);
            newNode.next = head;
            head = newNode;
        }

        public void addAtTail(int val) {
            SinglyListNode lastNote = head;
            while (lastNote != null) {
                //xac dinh last note
                if (lastNote.next == null) {
                    lastNote.next = new SinglyListNode(val);
                    return;
                }
                lastNote = lastNote.next;
            }
        }

        public void addAtIndex(int index, int val) {
            if (index == 0) {
                addAtHead(val);
            } else {
                SinglyListNode currNode = head;
                SinglyListNode newNode = new SinglyListNode(val);
                int count = 0;
                while (currNode != null) {
                    if (count == index - 1) {
                        newNode.next = currNode.next;
                        currNode.next = newNode;
                        return;
                    }
                    count++;
                    currNode = currNode.next;
                }
                if (count == index) {
                    addAtTail(val);
                }
            }
        }

        public void deleteAtIndex(int index) {
            SinglyListNode currNode = head;
            SinglyListNode preNode = null;
            int count = 0;
            while (currNode != null) {
                if (count == index) {
                    if (index == 0) {
                        head = head.next;
                    } else {
                        preNode.next = currNode.next;
                        return;
                    }
                }
                count++;
                preNode = currNode;
                currNode = currNode.next;
            }
        }

        public void printList() {
            SinglyListNode temp = head;
            System.out.printf("List: ");
            while (temp != null) {
                System.out.printf("%d ", temp.val);
                temp = temp.next;
            }
            System.out.println();
        }
    }

}
