class car{
       String brand;
       String model;
       long cost;
       public void speed(int speed){
          System.out.println("it's speed range is upto:"+ speed);
         //  System.out.println("cost of the vehicle:"+);
       }
}  

public class demo{
   
    public static void main(String []args){
      int speed=300;
      car obj=new car();
      obj.brand="XUV";
      obj.model="2026";
      obj.cost=10000000l;
      obj.speed(speed);
      System.out.println(obj.brand+" "+obj.model+" "+obj.cost);
    }
}