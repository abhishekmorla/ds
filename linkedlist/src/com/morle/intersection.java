package com.morle;
/*
int intersectVal = 4;
        ll list1 = new ll();
        ll list2 = new ll();
        list1.insertlast(1);
        list1.insertlast(2);
        list1.insertlast(3);
        list1.insertlast(4);
        list1.insertlast(5);
        list1.display();
        list2.insertlast(7);
        list2.insertlast(8);
        list2.insertlast(9);
        list2.insertlast(4);
        list2.insertlast(4);
        list2.insertlast(5);
        list2.display();
        Node tempa = list1.head;
        Node tempb = list2.head;
 */

public class intersection {

    // brute force approach :
    /*
    public int sol(){
        while (tempa != null)
        {
            while (tempb != null)
            {
                if (tempa.value == tempb.value)
                {
                    return tempa.value;
                }
                tempb = tempb.next;
            }
            tempa = tempa.next;
            tempb = list2.head;
        }
        return 0;
    }
     */

    // Hashset approach:
    /*
     HashSet<Integer> myhash = new HashSet<>();
        Set<Node> nodesinb = new HashSet<Node>(); // creating hashset for storing nodes of ll
        while(tempa != null)
        {
            myhash.add(tempa.value);
            tempa = tempa.next;
        }
        while(tempb != null)
        {
            if (myhash.contains(tempb.value)){
                return 1;
            }
            tempb = tempb.next;
        }
        return 0;

     */

    // Two pointers approach
    /*
    while(tempa != tempb)
        {
            if (tempa == null)
            {
                tempa = list2.head;
                continue;
            }
            if(tempb == null)
            {
                tempb = list1.head;
                continue;
            }
            tempa = tempa.next;
            tempb = tempb.next;
        }
        while (tempa != null && tempb!=null)
        {
            if (tempa == tempb)
            {
                return 1;
            }
            tempa = tempa.next;
            tempb = tempb.next;
        }
        return 0;
     */

}
