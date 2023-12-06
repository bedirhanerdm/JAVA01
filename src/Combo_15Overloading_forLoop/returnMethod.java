package Combo_15Overloading_forLoop;

import java.util.Scanner;

public class returnMethod {
    public static void main(String[] args) {
        
        //iki sayi al,carp ve bize dondur
        
        int sayi1=10;
        int sayi2=5;
        
        int sonuc=sayiCarp(sayi1,sayi2);
        System.out.println("sonuc = " + sonuc);
        
    }

    private static int sayiCarp(int sayi1, int sayi2) {
        
        Scanner scan=new Scanner(System.in);
        
        return sayi1*sayi2; 
    }
}
