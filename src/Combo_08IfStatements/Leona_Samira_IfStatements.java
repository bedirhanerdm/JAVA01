package Combo_08IfStatements;

import java.util.Scanner;

public class Leona_Samira_IfStatements {
    public static void main(String[] args) {

        /*
        Gun ismi girdir, 1,2 ve 3. harfleri yazdir bas harf buyuk olsun
        eger gun degilse uyari ver
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz..");

        String day=scan.next().toLowerCase();


        if (day.equals(("pazartesi")) || (day.equals("pazar"))){
            System.out.println("Paz");

        }else if (day.equals("sali")){
            System.out.println("Sal");

        } else if (day.equals("carsamba")) {
            System.out.println("Car");

        } else if (day.equals("persembe")) {
            System.out.println("Per");

        } else if ((day.equals("cuma")) || (day.equals("cumartesi"))) {
            System.out.println("Cum");

        }else {
            System.out.println("Lutfen gecerli bir gun giriniz");
        }
    }
}
