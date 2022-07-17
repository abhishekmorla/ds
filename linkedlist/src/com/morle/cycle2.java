package com.morle;

public class cycle2 {
    private Node head;
    private Node tail;
    private int size;
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

        public Node() {
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static Node nodewherecyclebegins(Node head){
        Node fast = head;
        Node slow = head;
        int c = 0;
        while(fast!= null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
            {
                Node counts = slow;
                do {
                    counts = counts.next;
                    c++;
                } while (slow != counts);
                break;
            }
        }
        if (c == 0)
        {
            return null;
        }
        Node first = head;
        Node second = head;
        while (c > 0)
        {
            first = first.next;
            c--;
        }
        while(first != second)
        {
            first = first.next;
            second = second.next;
        }
        return first;
    }

    public static void main(String[] args) {
        cycle2 node = new cycle2();
        node.insertlast(3);
        node.insertlast(1);
        node.insertlast(5);
        node.display();


    }
}
