package linked_list.medium;

import random.ListNode;


public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        System.err.println(removeNthFromEnd(listNode1, 2));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0, head);
        ListNode tmp = newHead;
        int length = 2;
        while (tmp.next.next != null) {
            tmp = tmp.next;
            length++;
        }
        if (n <= 0 || n > length) {
            return head;
        }
        if (n == length) {
            return head.next;
        }
        if (n == 1) {
            tmp.next = null;
            return head;
        }
        tmp.next.next = newHead;
        for (int i = 0; i < length - n + 2; i++) {
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
        for (int i = 0; i < n - 1; i++) {
            tmp = tmp.next;
        }
        tmp.next = null;
        return newHead.next;
    }
}
