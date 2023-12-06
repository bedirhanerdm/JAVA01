package Combo_39exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {

    /*
    Kullanici yasini girsin,
    0dan kucuk girerse exception versin
     */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz..: ");
        int yas = scan.nextInt();


        try {
            if (yas<0){

                throw new IllegalArgumentException(); // throws yaparsak exception verir, fakat
                                                      // kodun altindaki kirmizi cizgileri de goturup
                                                      // diger kodlarin normal bir sekilde calismasina izin verir

            } else {

                System.out.println("Yasiniz :" + yas);

            }
        } catch (IllegalArgumentException e) {

            e.printStackTrace();
            System.out.println("Yas negatif olamaz");



        } finally {

            System.out.println("Bu her zaman calisir");
        }


    }
}
