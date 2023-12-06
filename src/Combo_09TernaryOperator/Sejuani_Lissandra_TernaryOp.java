package Combo_09TernaryOperator;

import java.util.Scanner;

public class Sejuani_Lissandra_TernaryOp {
    public static void main(String[] args) {

        //Kullanicidan sayi alin ve mutlak degerini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi=scan.nextDouble();


        System.out.println(sayi>0 ? sayi : (-1 * sayi));

    }
}
