
class Circle {

    static final double PI = 3.14159;

    public static void main1() {
        double radius = 5;
        double area = PI * radius * radius;
        System.out.println(area);
    }
}

public class Day11 {
    public static void main(String[] args) {
        final int a = 6;
        // a=34;
        System.out.println(a);
        Circle c1 = new Circle();
        c1.main1();
    }

    
}
