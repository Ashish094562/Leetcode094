package com.ashish;


public class RemoveDuplicatesFromSortedList {

// implementation with tail
    private  ListNode head;
    private ListNode tail;
    private int size;
    public ListNode deleteDuplicates() {
        if(head == null){
            return head;
        }
        ListNode node = head;
        while(node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
    
        }
        return head;
    }

    public void insertFirst(int val){
        ListNode node =new ListNode(val);
        node.next=head;
        head = node;
        if(tail==null){
            tail=head;
        }
        size +=1;
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        ListNode node = new ListNode(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void display(){
        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.val+ " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    //  Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}