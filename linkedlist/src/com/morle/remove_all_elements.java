package com.morle;

public class remove_all_elements {

    // necesarry for all
    private Node head;
    private Node tail;
    private int size;
    public remove_all_elements() {
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



    public static remove_all_elements removeElements(remove_all_elements sol){
        int val = 3;
        Node dummyhead = new Node();
        Node prev = dummyhead; // dummyhead = prev
        Node temp = sol.head;
        while (temp != null)
        {
            if (temp.value == val)
            {
                prev.next = temp.next;
            }
            else{
                prev = temp; // it will always stay behind , by this way we can able to access thr previous node of temp value
            }
            temp = temp.next;
        }
        return sol;
    }







    public static void main(String[] args) {
        remove_all_elements list1 = new remove_all_elements();
        list1.insertlast(1);
        list1.insertlast(2);
        list1.insertlast(2);
        list1.insertlast(2);
        list1.insertlast(3);
        list1.insertlast(4);
        list1.insertlast(3);
        list1.display();
        remove_all_elements ans = remove_all_elements.removeElements(list1);
        ans.display();
    }

}
