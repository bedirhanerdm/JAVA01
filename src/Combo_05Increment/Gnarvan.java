package Combo_05Increment;

public class Gnarvan {
    public static void main(String[] args) {

        int sayi=10;

        System.out.println("Pre-increment= " + ++sayi); //sayi yazdirilir sonra 1 artirilir

        System.out.println("Post-increment= " + sayi++); //sayi 1 artirilir sonra yazdirilir

        System.out.println("Post-incrementten sonra= " + sayi);

        sayi++;
        System.out.println("sayi = " + sayi);


    }
}
