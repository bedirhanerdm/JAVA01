package Combo_05Increment;

public class PreIncrement_PostIncrement {
    public static void main(String[] args) {

        int sayi1=10;

        int sayi2=sayi1+1;
        sayi2+=5; // sayi2=16
        /*
        pre veya post inc/dec sadece ++ ve -- islemi icin gecerli.
         */

        int sayi3=sayi2++; //once sayi3 16 olur, sonra sayi2 17 olur

        int sayi4=++sayi1; //once sayi1 11 olur bu yuzden sayi4'de 11 olur

        System.out.println("sayi1= "+sayi1);
        System.out.println("sayi2 = " + sayi2);
        System.out.println("sayi3 = " + sayi3);
        System.out.println("sayi4 = " + sayi4);

    }
}
