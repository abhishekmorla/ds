package com.morle;

public class Main {
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = findsquare(n);
            fast = findsquare(findsquare(n));
        }while(fast != slow);
        if (slow == 1)
        {
            return true;
        }
        return false;

    }
    public static int findsquare(int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10; // gives last value of digit.
            rev = rev + rem * rem;
            n = n / 10; // will remove last digit (loop condition)
        }
        return rev;
    }

    public static void main(String[] args) {
//        int n = 100;
//        System.out.println(isHappy(n));



	ll list = new ll();
    System.out.println(list.sol());
//    list.insertlast(0);



//    list.display();
//    list.delete(0);
//    list.display();

//    list.insertFirst(8);
//    list.insertFirst(17);
//    list.insertlast(99);
//    list.insertatpos(100,3);
//    list.display();
//    list.delete(5);
//    list.display();
//    dll list = new dll();
//    list.insertFirst(3);
//    list.insertFirst(2);
//    list.insertFirst(8);
//    list.insertFirst(17);
//    list.insertlast(99);
//    list.display();
//    list.insertafter(65,8);
//    list.display();
//        cll list = new cll();
//        list.insert(8);
//        list.insert(9);
//        list.insert(2);
//        list.insert(7);
//        list.insert(17);
//        list.display();
    }
}
