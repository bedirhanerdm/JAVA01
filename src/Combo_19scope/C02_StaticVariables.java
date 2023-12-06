package Combo_19scope;

public class C02_StaticVariables {


    static int staticSayi=10;
    String isim="Mehmet";


    static int degersizStaticVar;
    int degersizInstanceVar;


    public static void main(String[] args) {

        /*
        bir variable static olusturulduysa objeler icin degil classlar icin gecerlidir
         */

        System.out.println(staticSayi); // 10

        staticMethod();

        staticSayi=12;
        System.out.println(staticSayi); // 12

        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();

        System.out.println(staticSayi); //20


    }

    public static void staticMethod(){

        System.out.println(staticSayi); // 10

    }

    public void staticOlmayanMethod(){

        System.out.println(staticSayi); // 12

        staticSayi=20;


    }


}
