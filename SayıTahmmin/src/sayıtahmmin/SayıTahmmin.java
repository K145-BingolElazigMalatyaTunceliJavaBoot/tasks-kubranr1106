
package sayıtahmmin;

import java.util.Random;

public class SayıTahmmin {
    public static void main(String[] args) {
       Random random=new Random();
        for (int j = 1; ;j++) {
            int i=random.nextInt(500);
            if (i>50 && i<100) {
                System.out.println("sayi:"+i+" "+j+".denemede buldu");
                
            }
        }
    }
    
}
