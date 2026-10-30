
class Student{
    public int age=0;
    public String name="None";

    Student(){};
    Student(int age1,String name1){
        age=age1;
        name=name1;
    };
    public void displayData(){
        System.out.println(age);
        System.out.println(name);
    }

    
    // public void setData(int age1,String name1){
    //     age=age1;
    //     name=name1;
    // }
}
public class Day8 {
    // public static void addNum(int num1,int num2){
    //     System.out.println("The sum is: "+(num1+num2));
    // }
    public static void walk(){
        System.out.println("Hunan is walking");
    }
    public static void run(){
        System.out.println("Hunan is running");
        walk();
    }

    public static void sleep(){
        System.out.println("Human is sleeping");
        run();
    }
    public static void main(String[] args) {
        // Student s3=new Student();
        // System.out.println(s3.age);
        // System.out.println(s3.name);
        // Student s1=new Student(55,"Peter");
        // System.out.println(s1.age);
        // System.out.println(s1.name);
        // Student s2=new Student(25,"Shivani");
        // System.out.println(s2.age);
        // System.out.println(s2.name);
        // s2.displayData();
        // addNum(6, 5);
        // sleep();
    }
}
