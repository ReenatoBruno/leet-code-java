package com.leetcode.medium;

public class ListNodeUtils {

    public static void printList(ListNode node) {

        if (node == null) {
            System.out.println("Empty list!");
            return;
        }

        while (node != null) {
            System.out.print(node.val);
            if (node.next != null)
                System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }
}