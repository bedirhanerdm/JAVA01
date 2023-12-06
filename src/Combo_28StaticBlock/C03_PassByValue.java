package Combo_28StaticBlock;

public class C03_PassByValue {

    public static void main(String[] args) {

        /*
          %25 indirimli fiyati hesaplayip bize donduren bir method olusturun
         */


        double satisFiyati=100;
        double indirimliFiyat= indirimliFiyatHesapla(satisFiyati);


        System.out.println("indirimli fiyat : " + indirimliFiyat);


    }


    public static double indirimliFiyatHesapla(double satisFiyati) {   // bu satisFiyati variable i mainde olusturdugumuz degeri alir (Value pass)


        double indirimliFiyat=satisFiyati*0.75;

        return indirimliFiyat;

    }
}
