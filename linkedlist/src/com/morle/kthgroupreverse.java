package com.morle;

// leetcode given
 class ListNode {
    int val;
    ListNode next;
    // constructors
    ListNode() {

    }
    ListNode(int val)
    {
        this.val = val;
    }
    ListNode(int val, ListNode next)
    {
        this.val = val; this.next = next;
    }
}

public class kthgroupreverse {

    // utility function to insert node in the list
    static ListNode push(ListNode head, int val)
    {
        ListNode newNode = new ListNode(val);
        // base condition
        if (head == null) {
            head = newNode;
            return head;
        }

        ListNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        return head;
    }
    // utility function to print the list
    static void print(ListNode head)
    {
        ListNode temp = head;
        while(temp!= null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static ListNode reverseKGroup(ListNode head, int k) {

        // initialization for reversing
        ListNode prev = null;
        ListNode present = head;

        // base condition
        if (k <=1 && head == null)
        {
            return head;
        }

        // counting elements
        int count = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }

        // infinite loop because we have to keep reversing till current become null
        while (true)
        {
            // like a temporary variable
            ListNode last = prev;  // so that last wont be gayab na ho jaye.
            ListNode new_end = present;  // so that last wont be gayab na ho jaye.

            // continuee reversing
            ListNode next = present.next;

                // keep checking if number of elements is equivalent to k
                if (count < k){
                    break;
                }

                // continue reversing upto k elements
                for (int i = 1; i < k; i++)
                {
                    present.next = prev;
                    prev = present;
                    present = next;
                    if (next != null){
                        next = next.next; // null pointer exection
                    }
                }
                count -= k; // keep substracting the elements for checking purpose

            if (last != null)
            {
                last.next = prev;
            }
            else{
                head = prev;
            }

            new_end.next = present; // thats how it helped in storing above


            if (present == null)
            {
                break;
            }

            prev = new_end; // so that after reversing it points to that element which if going to be reversed.
        }
        return head;

    }

    public static ListNode oddEvenList(ListNode head) {
        ListNode odd = head;
        ListNode even = head.next;
        ListNode eh = head.next; // storing a head which we require later when joining
        ListNode even_temp;
        while(even != null && even.next !=null)
        {
            even_temp = odd.next.next;
            odd.next = even_temp;
            odd = even_temp;

            even_temp = even.next.next;
            even.next = even_temp;
            even = even_temp;
        }
        odd.next = eh; // odd.next == null , other thn null points to head of the stored list.
        return head;

    }

    public static ListNode rotateRight(ListNode head, int k) {
        for (int i = 0;  i < k; i++) {
            ListNode temp1 = head;
            ListNode temp2 = head.next;
            while(temp2.next!= null)
            {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            temp2.next = head;
            temp1.next = null;

            head = temp2;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = null;
        head = push(head, 1);
        head = push(head, 2);
        head = push(head, 3);
        head = push(head, 4);
        head = push(head, 5);
//        head = push(head, 4);
//        head = push(head, 7);
        System.out.println("Given Linked List");
        print(head);
        System.out.println("Rotated list");
        ListNode newHead = rotateRight(head , 2);
        print(newHead);

    }
}
