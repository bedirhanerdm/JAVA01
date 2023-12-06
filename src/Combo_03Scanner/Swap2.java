package Combo_03Scanner;

public class Swap2 {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;

        System.out.println("1. sayi= " + sayi1);
        System.out.println("2. sayi= " + sayi2);
    }
}
