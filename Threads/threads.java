package Threads;

class Prathreads{
    public void sample(){
        for(int i=1;i<100;i++){
            System.out.println("Print"+i);
        }
    }
}

public class threads {
    public static void main(String[] args) {
        Prathreads a=new Prathreads();
        a.sample();
    }
}
