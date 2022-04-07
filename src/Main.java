import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] ch = chw();
        System.out.println(helloST());
        Wolf w = new Wolf(6.8f,50000,"Evgen", 3);
        Random rand = new Random();
        w.Woo();
        w.isRun();
        System.out.println("Name: "+w.getName());
        System.out.println("Weight: "+w.getVes());
        System.out.println("Height: "+w.getRost());
        System.out.println("Run? - "+w.getRun());
        System.out.println("He is "+w.getAges()+" years old");
        w.NextYear();
        System.out.println("He is "+w.getAges()+" years old");
        for (int i = 0;i<ch.length;i++)
            System.out.print(ch[i]);
        tabl();
        System.out.println();
        System.out.println("123 "+symb());
        System.out.println("qwe "+symb());
        System.out.println("boolean "+bo());
    }
    static String helloST() {
        String hg = "Hello, world!";
        return hg;
    }
    static char[] chw(){
        char [] ch = new char[]{'H','e','l','l','o',',',' ','w','o','r','l','d','!'};
        return ch;
    }
    static void tabl(){
        String d;
        for(int a=1; a<10;a++){
            System.out.print("\n");
            for(int b=1;b<10;b++){
                d=Integer.toString(a*b);
                System.out.print(b+"x"+a+"="+d);
                if (d.length()==2)
                    System.out.print("  ");
                else System.out.print("   ");

            }
        }
    }

    static float Home(float a, float b, float h){
        float V = a*b*h;
        return V;
    }
    static char symb(){
        Random rand = new Random();
        int ind = rand.nextInt(65,122);
        return (char)ind ;
    }
    static boolean bo(){
        Random rand = new Random();
        int ind = rand.nextInt(0,2);
        if (ind == 1) {return true;}
        else {return false;}
    }
}


