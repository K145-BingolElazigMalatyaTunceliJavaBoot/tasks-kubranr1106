
package asalıbulanve.toplayan;

public class AsalıBulanveToplayan {

    
    public static void main(String[] args) {
      int i, j, count =0;
      int toplam = 0;
        for (i = 3; i < 100; i++) {
            for (j = 1; j <= i/2; j++) {
                if (i%j == 0) {
                    count++;
                    
                }
                
            }
            if (count == 1) {
                toplam+=i;
                
            }
            count =0;
        }
        System.out.println(toplam);
    }
    
}
