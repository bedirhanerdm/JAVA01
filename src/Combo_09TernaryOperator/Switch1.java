package Combo_09TernaryOperator;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {

        /*
        kullanicidan 7ye kadar sayi al 1 ise pazartesi 7 ise pazar
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int gunNo=scan.nextInt();

        switch (gunNo){

            case 1:
                System.out.println("Pazartesi");
                break;

            case 2:
                System.out.println("Sali");
                break;

            case 3:
                System.out.println("Carsamba");
                break;

            case 4:
                System.out.println("Persembe");
                break;

            case 5:
                System.out.println("Cuma");
                break;

            case 6:
                System.out.println("Cumartesi");
                break;

            case 7:
                System.out.println("Pazar");
                break;

        }
    }
}
