package Combo_08IfStatements;

import java.util.Scanner;

public class Artik_Yil {
    public static void main(String[] args) {

        //Artik yil = 28/29 subat durumu

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz..");
        int yil=scan.nextInt();

        if (yil % 4 != 0){
            System.out.println("Artik yil degildir.");
        } else if (yil % 100 != 0) {
            System.out.println("Artik yildir..");
        } else if (yil % 400 != 0) {
            System.out.println("Artik yil degildir..");
        }else {
            System.out.println("Artik yildir..");
        }

    }
}
