package std621320104;
import java.util.Random;
public class Calculate{
        public void plus(int x,int y){ int z = x + y;}
        public void minus(int x,int y){ int z = x - y;}
}

class Randomm{
    public void rand(){
        Random rand = new Random();
        
        for(int i=0;i<20;i++){
            System.out.println(rand.nextInt(9));
        }
    }
}

class Run{
    public static void main(String[] args) {
        Randomm p2 = new Randomm();
        p2.rand();
    }
}
