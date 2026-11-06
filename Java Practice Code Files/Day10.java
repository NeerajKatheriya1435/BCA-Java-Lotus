
class Animal{
    public void run(){
        System.out.println("Animal can run");
    }
    public void walk(){
        System.out.println("Animal can walk");
    }
}

class Horse extends Animal {
    public void eat(){
        System.out.println("Animal can eat");
    }

    @Override 
    public void walk(){
        System.out.println("Horse is walking");
    }
}
class Day10{


    
    static int add(int a,int b){
        return a+b;
    }

    static double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        // Animal a1=new Animal();
        // a1.run();
        // a1.walk();
        System.out.println(add(2, 1));
        System.out.println(add(2.3, 1.3));
        // Horse h1=new Horse();
        // h1.eat();
        // h1.run();
        // h1.walk();

    }
}