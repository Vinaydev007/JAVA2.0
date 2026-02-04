 public class loops{
public static void main(String []args){
    int rows=5;
    for(int i=0;i<rows;i++){
        String star="";
        for(int k=rows;k<=1;k++){
            star+=" ";
        }
        for(int j=0;j<=i;j++){
            star+="*";
        }
        System.out.println(star);
    }
}
 }