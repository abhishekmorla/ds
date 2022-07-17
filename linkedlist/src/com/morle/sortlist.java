package com.morle;

public class sortlist {
    // necesarry for all
    private Node head;
    private Node tail;
    private int size;
    public sortlist() {
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

    public static merge_two mergetwo(sortlist first, sortlist second){
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

    public static int middleNode(Node sol) {
        Node fast = sol;
        Node slow = sol;
        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.value;
        /*
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
         */
    }

    public static Node sol(Node head){
        if (head == null || head.next == null)
        {
            return head;
        }
//        Node mid = middleNode(head);
        Node left = sol(head);
//        Node right = sol(mid);
        return head;
    }

}
