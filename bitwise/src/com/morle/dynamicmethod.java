package com.morle;

class Phone{
    public void on(){ // will not execute
        System.out.println("Turning on phone");
    }
    public void showtime(){ // will execute
        System.out.println("3am");
    }
    public void check() // will execute
    {
        System.out.println("checking..");
    }
}

class Smartphone extends Phone{
    public void music(){ // will not execute
        System.out.println("playing music");
    }
    public void video(){ // will not execute
        System.out.println("playing video");
    }
    @Override // it will be resolved at runtime rather than in compile time
    public void on(){ // it will only execute on method overriding
        System.out.println("Turning on Smart phone");
    }
}

public class dynamicmethod {
    public static void main(String[] args) {
        Phone obj = new Smartphone(); // every method of phone is executeable , but only method overriding of smartphone will execute
        obj.on();
        obj.check();
        obj.showtime();
    }
}
