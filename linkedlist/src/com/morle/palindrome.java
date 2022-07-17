package com.morle;

public class palindrome {
    // necesarry for all
    private Node head;
    private Node tail;
    private int size;
    public palindrome() {
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

    //sol
    public static Node middleNode(palindrome sol) {
        Node fast = sol.head;
        Node slow = sol.head;
        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static palindrome palindromi(palindrome head){
        Node firsts = head.head;
        Node s = head.head;
        Node second = middleNode(head);
        Node temp = second;
        //firsts pehla issa
        while(firsts != second){
            System.out.print(firsts.value+" -> ");
            firsts = firsts.next;
        }
        System.out.println("END");

        Node prev = null;
        Node present = temp;
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
        palindrome first = new palindrome();

        first.insertlast(7);
        first.insertlast(2);
        first.insertlast(9);
        first.insertlast(1);
        first.insertlast(1);
        first.insertlast(9);
        first.insertlast(2);
        first.insertlast(7);
//        first.insertlast(8);
        first.display();
        palindrome ans = palindrome.palindromi(first);
        ans.display();


    }
}
