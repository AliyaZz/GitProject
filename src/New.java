import java.util.ArrayList;
import java.util.Scanner;
public class New {

    ArrayList<Double> kv(int a,int b,int c){
        Scanner sc = new Scanner(System.in);
        double x;

        double d = b*b-4*a*c;
        ArrayList <Double> mas = new ArrayList<>();
        if (d<0 || a==0){

        }
        else if (d==0){
            x = b/(2*a);
            mas.add(x);
        }
        else{
            x = (0-b+Math.sqrt(d))/(2*a);
            mas.add(x);
            x = (0-b-Math.sqrt(d))/(2*a);
            mas.add(x);
        }
        return mas;
    }
    void hello(){
        System.out.println("Hello, world!");
    }
}
