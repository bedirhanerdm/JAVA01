package Combo_03Scanner;

import java.util.Scanner;

public class Odev7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz..");

        char ilkharf=scan.next().toUpperCase().charAt(0);

        System.out.println("Isminizin ilk harfi: " + ilkharf);
    }
}
