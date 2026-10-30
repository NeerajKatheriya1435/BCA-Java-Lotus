class Day6{
    public static void main(String[] args) {
        // int age=25673;
        // if(age>18){
        //     System.out.println("You can drive car");
        // }else{
        //     System.out.println("You can not drive car");
        // }

        // int age=17;
        // if(age<=0 || age>120){
        //     System.out.println("Invalid age");
        // }
        // else if(age>0 && age <18){
        //     System.out.println("You are a child");
        // }
        // else if(age>=18 && age <=80){
        //     System.out.println("You can drive the car");
        // }else{
        //     System.out.println("You are overaged");
        // }
        int value=245;
        switch (value) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
        
            default:
                System.out.println("Please input between 1 to 3");
                break;
        }
    }
}