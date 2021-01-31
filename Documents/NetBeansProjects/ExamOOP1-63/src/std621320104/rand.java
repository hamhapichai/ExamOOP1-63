package std621320104;
import java.util.Random;
public class rand {
    
    public static void randomint(){
        Random rando = new Random();
        for (int i = 1; i<20; i++){
            System.out.println(rando.nextInt(9));
        }
    }
}

