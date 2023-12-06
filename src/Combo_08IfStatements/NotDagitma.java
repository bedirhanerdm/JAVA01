package Combo_08IfStatements;

import java.util.Scanner;

public class NotDagitma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz..");
        double note=scan.nextDouble();

        if ((note<0) || (note>100)){
            System.out.println("Lutfen '0'dan '100'e kadar bir sayi giriniz..");
        } else if (note<50) {
            System.out.println("Notunuz= D");
        } else if (note<60) {
            System.out.println("Notunuz= C");
        } else if (note<80) {
            System.out.println("Notunuz= B");
        }else {
            System.out.println("Notunuz= A");
        }
    }
}
