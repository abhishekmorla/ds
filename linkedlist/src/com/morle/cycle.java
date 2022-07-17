package com.morle;

public class cycle {

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




        public static boolean hasCycle(Node head) {
            Node fast = head;
            Node slow = head;
            while(fast != null && fast.next != null)
            {

                fast = fast.next.next; //move fast ahead by 2
                slow = slow.next; //move slow by 1
                if (fast == slow) // has cycle
                {
                    Node counts = slow;
                    int c = 0;
                    do {
                        counts = counts.next;
                        c++;
                    } while(counts != slow);
                }
            }
            return false;
        }

    public static void main(String[] args) {
        cycle node = new cycle();
        node.insertlast(3);
        node.insertlast(1);
        node.insertlast(5);
        node.display();


    }
}
