package com.leetcode.easy;

public class ReverseLinkedList {
    public ListNode solveReverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + (node.next != null ? " -> " : ""));
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ReverseLinkedList solution = new ReverseLinkedList();

        ListNode head =  new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list" + head);

        ListNode reverted = solution.solveReverseList(head);
        System.out.println("Reversed list: ");
        printList(reverted);
    }
}
