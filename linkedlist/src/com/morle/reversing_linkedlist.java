package com.morle;

public class reversing_linkedlist {
    // necesarry for all
    private Node head;
    private Node tail;
    private int size;
    public reversing_linkedlist() {
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.value = val;
        head = node;

        if (tail == null) // if there was only one item we are doing this to maintain the tail also
        {
            tail = head;
        }
        size++;
    }
    public void insertlast(int val){
        if (tail == null){ // what if there is empty list
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
//            Node temp = head;
//            while (temp.next != null) {
//                temp = temp.next;
//            }
//            temp.next = node;
//            node.next = null;
//            node.value = val;
//            tail = node;
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private static class Node{

        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node() {

        }
    }


    // recursive
    private void reverse(Node node) {
        if (node == tail) //base condition when moves backward
        {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    // in place reversal of linkedlist

    public static reversing_linkedlist reversei(reversing_linkedlist head){
        Node prev = null;
        Node present = head.head;
        Node next = present.next;
        while(present != null)
        {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null){
                next = next.next; // null pointer exection
            }
            head.head = prev;
        }

        return head;
    }

    public static void main(String[] args) {
        reversing_linkedlist first = new reversing_linkedlist();
        reversing_linkedlist second = new reversing_linkedlist();

        first.insertlast(3);
        first.insertlast(5);
        first.insertlast(7);
        first.display();
        reversing_linkedlist ans = reversing_linkedlist.reversei(first);
        ans.display();
    }
}
