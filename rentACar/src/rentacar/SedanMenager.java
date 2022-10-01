
package rentacar;

public class SedanMenager extends BaseRentACarManager {
     public void aylıkKirala(){
        System.out.println("Aracınız aylık kiralanmıştır.");
    }
     public double aylikHesaplama (double ucret){
         return 30*ucret;
     }
}
