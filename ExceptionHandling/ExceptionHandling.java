package ExceptionHandling;

public class ExceptionHandling{
     public static void main(String args[]){
        int num=10;
        int num1=0;
        try {
            if(1==num/num1){
                System.out.println("No exception");
            }
        } catch (Exception e) {
            System.out.println("trows an error");
     }
}
}