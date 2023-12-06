package Combo_04Casting;

public class Casting2 {
    public static void main(String[] args) {

        byte sayi1 = 23;
        short sayi2 = 55;

        int sayi3 = sayi1+sayi2;  //88

        double sayi4 = sayi1*sayi2;  //1265.0

        sayi4 = (double)sayi2/sayi1;

        /* double yazmazsak int etkeninden dolayi 2 cikar ama
        sayi4 double oldugu icin (2.0) veri kaybi olur bu yuzden islemde sayi2yi double yapiyoruz
        */


    }
}
