package LeetCode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class MergeTwoLists {


    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode(0);
        System.out.println(mergeTwoLists(null, list2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tail = new ListNode(-1);
        ListNode result = tail;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                tail = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                tail = list2;
                list2 = list2.next;
            }
        }

        if (list1 != null) tail.next = list1;
        if (list2 != null) tail.next = list2;

        return result.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
