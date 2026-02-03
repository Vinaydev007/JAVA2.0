public class conditionalstatements {
    public static void main(String args[]){
        //conditional statements
        int Age=25;
        int weight=62;
        if(Age>=18&&weight>=50){
            System.out.println("Eligible for the gym");
        }
        else{
            System.out.println("Not eligible for the gym");
        }
        //switch
        int number=2;

        switch (number) {
            case 2:
                System.out.println("heloo");
                break;
            case 1:
                System.out.println("hii");
                break;
            default:
                System.out.println("vinay");
        }
    }
}
