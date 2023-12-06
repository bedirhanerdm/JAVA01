package Combo_18DoWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        /*

        int sayi=7;

        while (sayi<10){

            System.out.println(sayi);
            sayi++;
        }

        */

        //do while loopta ise ilk durum kosulu karsilamiyorsa bile her turlu calisir
        //kullanicidan deger alinan islemlerde daha cok tercih edilir

        //yukaridaki ornegin aynisini do while loop ile yapalim


        int sayi=7;
        do {

            System.out.println(sayi);
            sayi++;

        }while (sayi<10);

    }
}
