package Combo_09TernaryOperator;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {

        /*
        kullanicidan gun ismi al haftaici haftasonu yaz
         */

        String input= "pazartesi";
        input=input.toLowerCase();


        switch (input){
            case "pazartesi":


            case "sali":


            case "carsamba":


            case "persembe":


            case "cuma":
                System.out.println("Hafta ici");
                break;


            case "cumartesi":


            case "pazar":
                System.out.println("Hafta sonu");
                break;


        }
    }
}
