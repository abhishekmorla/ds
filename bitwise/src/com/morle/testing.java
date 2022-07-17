package com.morle;
import java.util.*;
class testing {
    public static void main(String[] args) {
        Sh s = new Sh();
        s.getxyvalue();
        s.showxyvalue();
        Sh s1 = new Rect();
        s1.getxyvalue();
        s1.showxyvalue();
    }
    static class Sh //Base class
    {
        int x,y;
        void getxyvalue()
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter value of x: ");
            x=sc.nextInt();
            System.out.print("Enter value of y: ");
            y=sc.nextInt();
        }

        void showxyvalue()

        {

            System.out.println("Co-ordinate x: "+x);

            System.out.println("Co-ordinate y: "+y);

        }

    }

    static class Rect extends Sh

    {

        int len,brd;

        void getxyvalue()
        {

            Scanner sc= new Scanner(System.in);

            System.out.print("Enter value of length: ");

            len=sc.nextInt();

            System.out.print("Enter value of breadth: ");

            brd=sc.nextInt();

        }

        void showxyvalue()

        {

            System.out.println("Length of Rectangle: "+len);

            System.out.println("Breadth of Rectangle: "+brd);

        }
    }
}


