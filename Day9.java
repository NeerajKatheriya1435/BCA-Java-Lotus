
class Human{
    public void sleep(){
        System.out.println("Human can sleep");
    }
    public void run(){
        System.out.println("Human can running");
    }
}

class Teacher extends Human{
    public void teach(){
        System.out.println("Human can teach");
    }
}

public class Day9 {
    
    public static void main(String[] args) {
    //     Human h1=new  Human();
    //     h1.sleep();
        Teacher t1=new Teacher();
        t1.sleep();
        t1.teach();
    }
}
