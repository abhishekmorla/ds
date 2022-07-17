package com.morle;

interface Attendance{
    float Required_percentage = 75;
    void percent(); //for checking
}
class Student {
    int roll;
    String name;
    int mark1;
    int mark2;
    Student(String n , int m1 , int m2 , int r )
    {
        this.name = n;
        this.mark1 = m1;
        this.mark2 = m2;
        this.roll = r;
    }
}
class Result extends Student implements Attendance {

    Result(String n, int m1, int m2, int r) {
        super(n, m1, m2, r); // because we are calling super class constructor
    }
    @Override // necessary if using interface
    public void percent() {
        int total=(mark1+mark2);
        double percent=total*100.0/200.0;
        System.out.println(percent);
        if (Required_percentage < percent)
        {
            System.out.println("attendance percentage is greater than required");
        }
        else{
            System.out.println("student is barred, intern will save , god will save him");
        }
    }
}
public class question {
    public static void main(String[] args) {
        Result r = new Result("abhi",81 ,91,1);
        r.percent();
    }
}
