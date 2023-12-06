package Combo_20Arrays;

public class C01_localVariables {


    public static void main(String[] args) {

        int sayi=10;

        //System.out.println(sayiMethod); sayiMethod method1 icinde olusturuldugu icin local variabledir


        for (int i=1; i<=10; i++){
            System.out.println(i);

        }
        //System.out.println(i); loop da bu kurallara dahil, loopta olusturulan variable baska yerde kullanilmaz


        // static int sayiStatic=20;  static keyword sadece class levelda kullanilabilir yani methodlarin icinde tanimlanamaz


    }

    public static void method1(){

        //System.out.println(sayi); sayi main classda veya baska classlarda olusturuldugu icin bu methodda kullanilamaz
        //local variable

        int sayiMethod=20;


    }

}
