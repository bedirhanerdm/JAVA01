package Combo_39exceptions;

import java.io.IOException;

public class C03_Exceptions {

    public static void main(String[] args) {

        String str = "123a5";



        int sayi = 0;

        try {

            sayi = Integer.parseInt(str);


        } catch (NumberFormatException n){

            System.out.println("Input sadece rakamlardan olusmali");

        } catch (Exception e){

            System.out.println("Ongorulemeyen bir hata olustu");
        }

        System.out.println("Sayinin karesi :" + sayi*sayi);

        /*
        Kullanicidan String olarak bir deger aliyor ve bunu Integera ceviriyorsak
        NumberFormatException ile karsilasabilecegimizi ongoruruz
        NFE aldigimizda kodun durmamasini istiyorsak try catch ile cevreleriz

        Eger bilmedigim bir exception daha olursa
        ve kod durmasin diyorsak
        bir kere daha catch yapip en genis exceptionu yazariz
         */

    }
}
