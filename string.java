// public class string {
//     public static void main(String[]args){
//      String Name=new String("vinay");
//      Name="madhu";
//      System.out.println(Name);
//     }
// }

class Human{
    int Age;
    String Name;
    public void setData(int Age){
        this.Age=Age;
        System.out.println(Age);
    }
}

public class string{
    public static void main(String[]args){
      Human info= new Human();
      info.setData(25);
      System.out.println(info.Age+ " " +info.Name);
    }
}
