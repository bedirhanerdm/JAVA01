package Combo_13MethodCreation;

public class C04_Method_Creation {
    public static void main(String[] args) {

        //2 integer inputu toplayip sonucu yazdiran bir method olusturun

        int input1=10;
        int input2=20;

        /*
        method 4 adimda olusturulur
         */

        // 1. method call
        // 2. argument eklenmesi lazimsa eklenir, eger methodun return type i void degilse bir
        //   variable olusturup method call'u assign edelim



        topla(input1,input2);

    }
    public static void topla(int input1, int input2) {         //public yerine private olabilir ama
                                                               // bu package da bunu kullanan olmaz
        // 3. method deklarasyonunda degistirilmesi gereken bolumleri degistir
        //    (access modifier,return type)
        // 4. eger return type void disinda biseyse return keyword u ve donus degerini hesaplamaliyiz

        System.out.println("Girilen iki sayinin toplami: "+(input1+input2));

    }

}
