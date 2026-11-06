
interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

interface connectivity {
    int battery=45;
    void blutooth();
    void music();
}

interface power {
    void powerOn();

    void powerOff();
}

class Phone implements connectivity, power {
    public void blutooth() {
        System.out.println("Phone can use blutooth");
    }

    public void music() {
        System.out.println("Phonne can play music");
    }

    public void powerOn() {
        System.out.println("Phone is Starting");
    }

    public void powerOff() {
        System.out.println("Phone is powering off");
    }
}

public class Day13 {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.blutooth();
        p1.music();
        p1.powerOn();
        p1.powerOff();
        System.out.println(connectivity.battery);
    }
}
