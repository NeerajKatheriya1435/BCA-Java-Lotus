
abstract class Employee{
    abstract public void sleep();
    abstract public void run();
}

class Programmer extends Employee{

    public void sleep(){
        System.out.println("Human can sleep");
    }
    public void run(){
        System.out.println("Human can run");
    }
    public void walk(){
        System.out.println("Human can walk");
    }
}
class Day12{
    public static void main(String[] args) {
        // Employee e1= new Employee();
        Programmer p1=new Programmer();
        p1.run();
        p1.walk();
        p1.sleep();
    }
}