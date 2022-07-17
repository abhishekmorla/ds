package com.morle;

public class merge_two {

    // necesarry for all
    private Node head;
    private Node tail;
    private int size;
    public merge_two() {
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



    // solution
    /*
    for leetcode
    node dummyhead = new node();
    node tail = dummyhead;

    for adding :
    tail.next = f;
    f = f.next;
    tail = tail.next;

    //leetcode sol:
    ListNode dummyhead = new ListNode();
    ListNode tail = dummyhead;

        while(f != null && s != null)
        {
            if (f.val < s.val)
            {

                tail.next = f;
                f = f.next;
                tail = tail.next;
            }
            else{
                tail.next = s;
                 s = s.next;
                tail = tail.next;
            }
        }

        while(f != null)
        {
            tail.next = f;
                f = f.next;
                tail = tail.next;
        }
        while(s != null)
        {
            tail.next = s;
            s = s.next;
            tail = tail.next;
        }
    return dummyhead.next;

     */
    public static merge_two solution(merge_two first, merge_two second){
        Node f = first.head;
        Node s = second.head;

        Node dummyhead = new Node();
        // act as a previous node
        Node tail = dummyhead;
        merge_two ans = new merge_two();

        while(f != null && s != null)
        {
            if (f.value < s.value)
            {
                ans.insertlast(f.value);
                // tail.next = f;
                //  tail = tail.next;
                f = f.next;
            }
            else{
                //tail.next = s;
                //tail = tail.next;
                ans.insertlast(s.value);
                s = s.next;
            }
        }

        while(f != null)
        {
            ans.insertlast(f.value);
            f = f.next;
        }
        while(s != null)
        {
            ans.insertlast(s.value);
            s = s.next;
        }
    return ans;
    }

    public static void main(String[] args) {
        merge_two first = new merge_two();
        merge_two second = new merge_two();

        first.insertlast(3);
        first.insertlast(5);
        first.insertlast(7);

        second.insertlast(6);
        second.insertlast(8);
        second.insertlast(9);

        merge_two ans = merge_two.solution(first,second);
        ans.display();
    }


}
