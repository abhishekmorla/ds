package com.morle;

public class remove_duplicate {
    private Node head;
    private int size;
    private Node tail;

    public void solution() {
        Node node = head;

//  ListNode head = node;
//        if (node == null)
//        {
//            return node;
//        }
//        for leetcode

        while(node.next != null)
        {
            if (node.value == node.next.value)
            {
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }

    }

    private static class Node {
        private int value;
        private Node next;

        public Node() {
            int size = 0;
        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
