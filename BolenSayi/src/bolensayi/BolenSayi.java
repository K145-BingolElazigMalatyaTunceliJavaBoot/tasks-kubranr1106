
package bolensayi;


public class BolenSayi {

   
    public static void main(String[] args) {
       int toplam=0;
        for (int i = 200; i < 500; i++) {
            if (i%3!=0) {//3e bölünmeyen sayıları seçip topladı
                toplam+=i;
                
            }
            
        }
        System.out.println(toplam);
    }
    
}
