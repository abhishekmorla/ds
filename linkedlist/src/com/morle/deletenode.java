package com.morle;

public class deletenode {


    private Node head;
    private Node tail;
    private int size;
    public deletenode() {
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

        public Node() {
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static deletenode solution(deletenode node){
        Node f = node.head;
        Node temp = new Node();
        temp.value = f.next.value;
        f.value = temp.value;
        f.next = f.next.next;
        return node;
    }

    public static void main(String[] args) {
        deletenode node = new deletenode();
        node.insertlast(3);
        node.insertlast(1);
        node.insertlast(5);
        node.display();

        deletenode ans = deletenode.solution(node);
        ans.display();



    }
}

