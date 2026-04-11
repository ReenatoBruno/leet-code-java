package com.leetcode.medium;

public class AddTwoNumbers {

    public ListNode solveAddTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) return null;

        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int val1 = (l1 != null ? l1.val : 0);
            int val2 = (l2 != null ? l2.val : 0);
            int sum = val1 + val2 + carry;

            carry = sum / 10;
            int digit = sum % 10;

            current.next = new ListNode(digit);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {

        AddTwoNumbers solution = new AddTwoNumbers();

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = solution.solveAddTwoNumbers(l1, l2);

        ListNodeUtils.printList(result);
    }
}
