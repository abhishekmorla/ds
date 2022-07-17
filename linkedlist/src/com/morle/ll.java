package com.morle;


public class ll {

    private Node head;
    private Node tail;

    private int size;

    public ll() {
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

    public void addtwonumbers(ll l1 ,  ll l2 , ll store)
    {
        Node temp1 = l1.head;
        Node temp2 = l2.head;
        int carry = 0;
        Node add = store.head;
        while (temp1 != null || temp2 != null || carry == 1)
        {
           int sum = 0;
           if (temp1!= null)
           {
               temp1 = temp1.next;
               sum = sum + temp1.value;
           }
           if (temp2 != null)
           {
               sum = sum + temp2.value;
               temp2 = temp2.next;
           }

        }


        while(temp1 != null)
        {
            store.insertFirst(temp1.value);
            temp1 = temp1.next;
        }
//
        while(temp2 != null)
        {
            store.insertFirst(temp2.value);
            temp2 = temp2.next;
        }

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
    public void insertatpos(int val, int pos)
    {
        if (pos == 0)
        {
            insertFirst(val);
            return;
        }
        if (pos == size){
            insertlast(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        Node temp1;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        temp1 = temp.next; // firstly jump the gap by temp1 var then ,
        temp.next = node;
        node.next = temp1;

        // Node node = new Node(val , temp.next)
        // temp.next = node;
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
    public void displayrev(){
        Node temp = head;
        Node prevtemp = null;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int deletefirst(){
        int val = head.value;
        head = head.next;
        if (head == null)
        {
            tail = null;
        }
        size--;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // insert using recursion
    public void insertrec(int val , int index)
    {
        head = insertRec(val , index , head);
    }
    private Node insertRec(int val , int index , Node node) {
        if (index == 0)
        {
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
      node.next = insertRec(val , index-- , node.next);
        return node;
    }
    public int deletelast(){
        if (size <= 1 )
        {
            return deletefirst();
        }
        // this will get to last value of the list.
        Node temp = head;
        for (int i = 1; i < size-1; i++) {
            temp = temp.next;
        }

        //Node secondlast = get(size-2);
        //tail = secondlast;
        tail = temp;
        tail.next = null;
        return temp.value;
    }

    public void delete(int pos){
//         this will get at pos - 1 .
        Node temp = head;
        for (int i = 0; i < pos-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

//        // this will get at pos (it will not help in delete.)
//        Node temp1 = head;
//        for (int i = 0; i < pos; i++) {
//            temp1 = temp1.next;
//        }
//        System.out.println(temp1.value);
//        temp1.next = temp1.next.next;


//        temp.next = temp1.next;

        // Node perv = get(index-1);
        // int val = prev.next.value;

//        prev.next = prev.next.next;
    }

    public void removeNthFromEnd(Node head, int n) {
        Node temp = head;
        int c = 0;
        while (temp != null)
        {
            temp = temp.next;
            c++;
        }
        Node prev = null;
        Node presents = head;
        for (int i = 0; i < c - n; i++) {
            prev = presents;
            presents = presents.next;
        }
        if (presents.next == null)
        {
            prev = null;
        }
        prev.next = presents.next;
        if (c == 1)
        {

        }

        System.out.println(c);

    }
    public int sol(){
        int intersectVal = 4;
        ll list1 = new ll();
        ll list2 = new ll();
        ll store = new ll();
        ll list3 = new ll();
        list1.insertlast(9);
        list1.insertlast(9);
        list1.insertlast(9);
        list2.insertlast(9);
        list2.insertlast(9);
        list2.insertlast(9);
//        list2.insertlast(3);
//        list2.insertlast(3);
//        list2.insertlast(3);


        list1.display();
        list2.display();
        list3.addtwonumbers(list1 , list2, store);
        store.display();
        return 0;
    }

    class Node{
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


}
