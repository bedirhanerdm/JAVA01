package Combo_18DoWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {


        /*

        pozitif sayi iste
        islemi bitirmek icin 0 a bassin
        yanlislikla negatif girilirse uyari ver basa dondur
        0a bastiginda kac pozitif sayi girdigini
        kac yanlislikla negatif girdigini
        ve pozitiflerin toplamini girin

         */

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int pozSayiAdedi=0;
        int negSayiAdedi=0;
        int pozSayiTop=0;

        do {
            System.out.println("Lutfen toplamak icin pozitif sayi giriniz");
            sayi= scan.nextInt();

            if (sayi>0){
                pozSayiTop+=sayi;
                pozSayiAdedi++;
            } else if (sayi<0) {
                System.out.println("Negatif sayi girme kardesim");
                negSayiAdedi++;
            }
        }while (sayi!=0);

        System.out.println(pozSayiAdedi + " adet pozitif sayi girdiniz. Toplamlari = " + pozSayiTop);
        System.out.println(negSayiAdedi + " adet negatif sayi girdiniz ancak onlar toplama dahil edilmedi");
    }
}
