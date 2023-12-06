package Combo_18DoWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        /*
        kullanicidan sayi al
        cift girerse yazdir
        tek sayida islemi bitir
         */

        // while ile;
        Scanner scan=new Scanner(System.in);
        int sayi=0;



        while (sayi%2==0){

            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            if (sayi%2==0){
                System.out.println("girdiginiz sayi cift= " + sayi);

            }else {
                System.out.println("girilen sayi tek veya gecersiz, benden bu kadar");
            }
        }

        // do while loop ile yapalim
        // "  "  "  da onceden olusturulan variable a hangi degerin atandiginin onemi yok
        // kod her durumda calisir

        // do while in dezavantaji ilk calistirma kontrol yapilmadan oldugu icin loop un bodysinden
        // yanlis bir islem yapilmamasina dikkat edilmeli


        do{

            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();

            if (sayi%2==0){
                System.out.println("Girilen sayi cift : " + sayi);

            }else{
                System.out.println("Girilen sayi tek, benden bu kadar");
            }

        }while(sayi%2==0);
    }
}
