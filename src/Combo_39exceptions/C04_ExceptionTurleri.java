package Combo_39exceptions;

public class C04_ExceptionTurleri {

    public static void main(String[] args) {


        String str;

        /*
        System.out.println(str);
        deger atamasiz bir variable kullanmaya calisirsaniz
        Java compile time da farkeder ve size izin vermez
         */

        str = null;

        // System.out.println(str.length());
        // NullPointerException

        Object obj = "Java Java Java";
        Integer sayi = (Integer) obj;



    }
}
