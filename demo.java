class car{
       String brand;
       String model;
       int Cost;
       public void speed(int speed){
          System.out.println("it's spped range is upto"+ speed);
       }
}  

public class demo{
   
    public static void main(String []args){
         int speed=300;
      car obj=new car();
      obj.brand="XUV";
      obj.model="2026";
      obj.speed(speed);
    }
}