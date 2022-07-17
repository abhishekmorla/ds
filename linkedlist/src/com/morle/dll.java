package com.morle;

public class dll {
    private Node head; // by default its null

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        //what if there is no element in dll
        if (head != null)
        {
            head.prev = node;
        }
        head = node;
    }
    public void insertlast(int val)
    {
        if (head == null)
        {
            insertFirst(val);
            return;
        }
       Node temp = head;
       Node node = new Node(val);
       while(temp.next != null) // for last element.
       {
           temp = temp.next;
       }
      node.next = null;
      node.prev = temp;
      temp.next = node;
    }
    public Node find(int value){
        Node node = head;
        while(node != null)
        {
            if (value == node.val)
            {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void insertafter(int val , int after){
        Node node = new Node(val);
        Node p = find(after);
        if (p == null)
        {
            System.out.println("does not exist");
            return;
        }
        if (p.next == null)
        {
            insertlast(val);
            return;
        }
        node.next =  p.next;
        node.prev = p;
        p.next.prev = node;
        p.next = node;
//        if (index == 0)
//        {
//            insertFirst(val);
//            return;
//        }
//        Node n = head;
//        int c = 0;
//        while(n!= null){
//            n = n.next;
//            c++;
//        }
//        if ( c-1 <= index){
//            insertlast(val);
//            return;
//        }
//        System.out.println("jijkolk"+c);
//        Node temp = head;
//        Node temp1 = head;
//        for (int i = 0; i < index; i++) {
//            temp = temp.next;
//        }
//        node.next = temp.next;
//        temp.next = node;
//        node.prev = temp;
//        temp.next.prev = node;
//
//        temp1 = temp.prev;
//        temp1.next = node;
//        node.prev = temp1;
//        node.next = temp;
//        temp.prev = node;
    }
    public void display(){
        Node node = head;
        Node last = node; // will point to last node
        while(node != null)
        {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

//        System.out.println("Print in reverse");
//        while(last!=null)
//        {
//            System.out.print(last.val + " <- ");
//            last = last.prev;
//        }
//        System.out.println("START");

    }


    private class Node{
        int val;
        Node next; // null
        Node prev; // null

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
