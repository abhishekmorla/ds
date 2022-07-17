package com.morle;

class A {
    public int harry(){
        return 4;
    }
    public void hello(int a,int b){
        System.out.println("hello of a");
    }
}
class B extends A{
    public void hello2(){
        System.out.println("hello2 of B");
    }
    @Override
    public void hello(int a,int b){
        System.out.println("hello of b");
    }
}
public class overriding { // to tell overriding
    public static void main(String[] args) {
            B obj = new B();
            A obja = new A();
    }
}
