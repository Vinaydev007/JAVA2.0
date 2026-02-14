package Oops;

abstract class Car{
 abstract public void drive();
 abstract public void speed();
  public void playmusic(){
    System.out.println("plays music");
  }
}

 abstract class Xuv extends Car{
    public void drive(){
        System.out.println("It is brand new model in the market");
    }
}

class UpdatedXuv extends Xuv{
   public void speed(){
         System.out.println("In 5 seconds it reach upto 150km/hr");
    }
}

public class Abstract {
    public static void main(String[]args){
    Car obj=new UpdatedXuv();
    obj.drive();
    obj.playmusic();
    obj.speed();
    }
}
