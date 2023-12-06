package Combo_27StaticKeyword;

public class C01 {

    static int sayi = 10;
    int rakam = 5;

    public static void main(String[] args) {


        /*
        class levelde 2 tur variable olusturulur
        1- instance
        2- static
        staticler her yerden kullanilirken instance lar obje yardimi ile kullanilir
        fakat static olmayan methodlardan instance direkt kullanilabilir
         */



        C01 obj1 = new C01();

        System.out.println("obj1 in rakam degeri : " + obj1.rakam); // 5

        System.out.println("obj1 in sayi degeri : " + sayi); // sayi static oldugu icin obj1. yapmaya gerek yok = 10

        System.out.println("");


        obj1.rakam+=1;  // 6
        sayi+=1; // 11

        System.out.println("1 artirdiktan sonra obj1 in rakam degeri : " + obj1.rakam); // 6

        System.out.println("1 artirdiktan sonra obj1 in sayi degeri : " + sayi); // 11

        System.out.println("");



        C01 obj2 = new C01();

        System.out.println("obj2 in rakam degeri : " + obj2.rakam); // 5
        System.out.println("obj1 in sayi degeri : " + sayi); // 11

        // instance variable larin degistirilmesi obje icinde kalir ve yeni objeyle birlikte eski degisim iptal olur
        // staticlerde ise hep takip etmemiz gerekiyor degisiklikler kalici

    }
}
