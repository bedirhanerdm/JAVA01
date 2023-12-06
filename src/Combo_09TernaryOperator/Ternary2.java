package Combo_09TernaryOperator;

import java.util.Scanner;

public class Ternary2 {
    public static void main(String[] args) {

        //pozitifse pozitif yazdir, degilse karesini al

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        double x=scan.nextDouble();

        //farkli data tiplerinde olacaksa sadece yazdirilabilir

        System.out.println(x>0 ? "Sayi pozitif" : (x*x));
    }
}
