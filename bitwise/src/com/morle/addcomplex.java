package com.morle;

class Complex{
    int real , img;
    Complex(){
    }
    Complex(int a , int b)
    {
        real = a;
        img = b;
    }
    Complex addComp (Complex x1 , Complex x2) // complex = return type , addcomp = name of function
    {
        Complex ans = new Complex();
        ans.img = x1.img + x2.img;
        ans.real = x2.real + x2.real;
        return ans;
    }
}

public class addcomplex {
    public static void main(String[] args) {
            Complex obj = new Complex(3,2);
            Complex obj1 = new Complex(3,2);
            Complex C3 = new Complex();
            C3 = C3.addComp(obj, obj1);
            System.out.println(C3.real + " + " + "i"+C3.img);
    }
}
