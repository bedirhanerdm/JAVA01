package Combo_15Overloading_forLoop;

public class overloading2 {
    public static void main(String[] args) {

        topla(5,7); //12
        topla(5.2,4); //9.2

        //Java hangi methodun calisacagina karar verirken optimizasyon yapar.
        //eger hic vast yapmadan kullanabilecegi bir method varsa onu kullanir.
        //eger cast yapmadan kullanacagi method yoksa bu defa en az cast yaptiran methodu kullanir.


    }
    public static void topla(int sayi1, int sayi2){
        System.out.println("2 integer'in toplami = " + (sayi1+sayi2));

    }
    /*
    public static void topla(int sayi3, int sayi4) {
    System.out.println("2 integer'in toplami = " + (sayi3 + sayi4));

    }
     */

    // bir classta parametre sayisi ve parametre data turleri ayni 2 method olamaz

    public static void topla(double sayi1, double sayi2) {
        System.out.println("2 double toplami = " + (sayi1 + sayi2));

    }

    public static void topla(double sayi1, int sayi2) {
        System.out.println("1 int ve 1 double toplami = " + (sayi1 + sayi2));

    }



}
