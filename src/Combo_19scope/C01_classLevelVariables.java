package Combo_19scope;

public class C01_classLevelVariables {

    /*
    Class icinde her yerde kullanilacak variablelari class levelda olustururuz.
     (class ici ama method disinda)
    Genellikle class level variable lar kolaylik olsun diye class basinda olusturulur

    Class leveldaki variablelar icin 2 scope var
    1- static (class variablelari)
    2- instance (static olmayan, obje variablelari)
    */

    int instSayi=20;  // static olmayip class levelde oldugu icin instance variable dir.

    public static void main(String[] args) {

        //System.out.println(instSayi);
        //static olmadigi icin static olan main classda direkt kullanamayiz
        //dolayisiyla obje olusturursaniz instance variablelari her yerden kullanabilirsiniz

        C01_classLevelVariables obje1 = new C01_classLevelVariables();
        System.out.println(obje1.instSayi); //20

        obje1.instSayi=30;
        System.out.println(obje1.instSayi); //30



        C01_classLevelVariables obje2 = new C01_classLevelVariables();
        System.out.println(obje2.instSayi); //20

        obje2.instSayi=25;
        System.out.println(obje2.instSayi); //25

        //Her olusturulan obje, instance variableinin ilk atanan degerini alir




    }

    public static void staticmethod(){

        int sayi=10;

    }

    public void staticOlmayanMethod(){
        // System.out.println(sayi);

        /*
        bir methodda olusturulan variable sadece o method icinden kullanilabilir.
         */

        //local variables

        System.out.println(instSayi);

    }


}
