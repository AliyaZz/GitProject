import java.util.Random;
import java.util.stream.IntStream;

public class Ves {
    int[] mc;
    int[] mv;
    Random r = new Random();

    public Ves(int[] mc,int[] mv){
        this.mc = mc;
        this.mv = mv;
    }

    public int getMc() {
        int[] mv = new int[this.mv.length];
        int c = 0;
        int pc = 0;
        int l = 0;
        int a = (int) r.nextInt(0, IntStream.of(this.mv).sum()-1);
        System.out.println(a);
        for (int i = 0; i < this.mv.length;i++){
            c+=this.mv[i];
            if (i!=0){pc+=this.mv[i-1];}
            if (a>pc && a<=c){
                l = this.mc[i];
                break;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        Ves ves = new Ves(new int []{1,2,3},new int []{1,2,10});
        System.out.println(ves.getMc());
    }
}
