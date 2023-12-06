package Combo_19scope;

public class C03_ClassVariables {


    public static void main(String[] args) {


        /*
        Farkli bir class calistirirken onceki classlarin ismini yazip nokta koyarsak
        adini yazdigimiz classtaki tum static class uyelerini bize sunar
         */

        C02_StaticVariables.staticMethod(); //10
        System.out.println(C02_StaticVariables.staticSayi); //10
        System.out.println(C02_StaticVariables.degersizStaticVar); //int degeri = 0

        /*
        Class level variablelara deger atamayabiliriz,
        eger ki deger atamazsak java bunlara default deger atar
        int == 0
        String == null
        boolean == false
        char == '' (hiclik)
         */

        /*
        baska classtaki instance variablelara ulasmak icin ise obje olusturarak ulasilir.
         */

        C02_StaticVariables obje1 = new C02_StaticVariables();

        obje1.staticOlmayanMethod(); // 10
        //bu method icinde 10 olarak yazdirilip sonrasinda 20ye artirildigi icin suanda staticSayi 20

        System.out.println(obje1.isim); // Mehmet

        System.out.println(obje1.degersizInstanceVar); // int icin default olan deger = 0

        System.out.println(C02_StaticVariables.staticSayi); //20 cunku yukarida yukselttik


    }
}
