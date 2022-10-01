package rentacar;

public class RentACar {

    public static void main(String[] args) {
        BaseRentACar baseRentACarHatchback = new BaseRentACar();
        baseRentACarHatchback.setBagajKapasitesi(250);
        baseRentACarHatchback.setId(44);
        baseRentACarHatchback.setModel("Clio");
        baseRentACarHatchback.setMotorGucu(1.6);

        BaseRentACar baseRentACarSuv = new BaseRentACar();
        baseRentACarSuv.setBagajKapasitesi(3000);
        baseRentACarSuv.setId(45);
        baseRentACarSuv.setModel("Qashqai");
        baseRentACarSuv.setMotorGucu(1.5);

        BaseRentACar baseRentACarSedan = new BaseRentACar();
        baseRentACarSedan.setBagajKapasitesi(400);
        baseRentACarSedan.setId(46);
        baseRentACarSedan.setModel("Corolla");
        baseRentACarSedan.setMotorGucu(1.6);

        BaseRentACar[] baseRentACars = new BaseRentACar[]{baseRentACarHatchback, baseRentACarSedan, baseRentACarSuv};
        for (BaseRentACar baseRentACar : baseRentACars) {
            System.out.println("Arac Model: " + baseRentACar.getModel() + "/" + "Arac motor gucu" +baseRentACar.getMotorGucu());

        }
        SuvManager suvManager = new SuvManager();
        suvManager.gunlukHesapla(350);
        System.out.println("Suv arac aylik kiralama ucreti: " + suvManager.aylikHesaplama(350) + " " + "Suv arac gunluk kiralama ucreti: " + suvManager.gunlukHesapla(350));

        SedanMenager sedanMenager = new SedanMenager();
        sedanMenager.gunlukHesapla(200);
        System.out.println(" Sedan arac aylik kiralama ucreti: " + sedanMenager.aylikHesaplama(200) + " " + " Sedan arac gunluk kiralama ucreti: " + sedanMenager.gunlukHesapla(200));

        HatchbackManager hatchbackManager = new HatchbackManager();
        hatchbackManager.individualRental();
        System.out.println("Hatchback arac gunluk kiralama ucreti: " + hatchbackManager.gunlukHesapla(150));

    }

}
