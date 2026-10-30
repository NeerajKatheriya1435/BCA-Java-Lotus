
class Student{
    public int age=0;
    public String name="None";

    public void setData(int age1,String name1){
        age=age1;
        name=name1;
    }
}

public class Day7 {

    static int addTwoNum(int a,int b){
        return  a+b;
    }

    static double addTwoNum(int a,double b){
        return  a+b;
    }
    public static void main(String[] args) {
        System.out.println(addTwoNum(7,9.5));
        // Student s1=new Student();
        // // s1.age=56;
        // // s1.name="Rohan";
        // s1.setData(45, "Mohan");
        // System.out.println(s1.age);
        // System.out.println(s1.name);

        // Student s2=new Student();
        // // s2.age=89;
        // // s2.name="Shiva";
        // s2.setData(23, "Shiva");
        // System.out.println(s2.age);
        // System.out.println(s2.name);
    }
    
}