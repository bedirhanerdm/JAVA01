package Combo_17nestedForLoop;

import java.util.Scanner;

public class C08_whileLoop {
    public static void main(String[] args) {

        /*
        kullanicidan toplanmak uzere sayilar alin
        sayilar toplami 500u gecince
        sayilarin toplamini ve kac sayi toplandigini yazdirin
        --13 sayi girdiniz ve toplamlari 567 gibi
         */


        int toplam=0;
        int sayi=0;
        int sayac=0;

        Scanner scan= new Scanner(System.in);



        while (toplam<500){
            System.out.println("Lutfen toplamak icin sayi giriniz");
            sayi=scan.nextInt();
            toplam += sayi;
            sayac++;
        }
        System.out.println(sayac + " sayi girdiniz ve toplamlari= " + toplam);




    }
}
