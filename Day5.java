class Day5{
    public static void main(String[] args) {
        // int age=16345;
        // if (age>18) {
        //     System.out.println("You can drive the car");
        // }
        // else{
        //     System.out.println("You can not drive");
        // }

    //     int age=90;
    //     if (age<=0 || age>120) {
    //         System.out.println("Invalid age");
    //     }
    //     else if(age>0 && age<18){
    //         System.out.println("You are child");
    //     }
    //     else if(age>=18 && age<=80){
    //         System.out.println("You can drive the car");
    //     }
    //     else{
    //         System.out.println("You are overaged");
    //     }
    // }

    int day=1;
    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
    
        default:
            System.out.println("Please input 1 to 3");
            break;
    }
    }
}