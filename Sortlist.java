package com.ashish;

public class Sortlist {

    public ListNode sortList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = getMid(head);

        ListNode right = mid.next;
        mid.next = null;
        ListNode sortLeft = sortList(head);
        ListNode sortRight = sortList(right);
        return merge(sortLeft,sortRight);
    }
    ListNode merge(ListNode list1,ListNode list2) {
        ListNode list  = new ListNode();
        ListNode tail = list;
        while(list1 !=null && list2 !=null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }
            else{
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return list.next;
    }
    ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        return prev;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
