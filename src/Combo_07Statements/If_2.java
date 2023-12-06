package Combo_07Statements;

import java.util.Scanner;

public class If_2 {
    public static void main(String[] args) {
        /*
        kullanicidan gun al, hafta ici mi hafta sonu mu yazdir
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ismi giriniz");

        String day=scan.next().toLowerCase(); //tolowercase ekledigimiz icin sonuc olarak hepsi kucuk harfle yazdirilacak

        if (day.equals("pazar") || day.equals("cumartesi")){
            System.out.println("Girilen gun HAFTASONU");
        }

        if (day.equals("pazartesi") || day.equals("sali") || day.equals("carsamba") || day.equals("persembe") ||
        day.equals("cuma")){
            System.out.println("Girilen gun HAFTAICI");
        }
        if (!(day.equals("pazartesi") || day.equals("sali") || day.equals("carsamba") || day.equals("persembe") ||
                day.equals("cuma") || day.equals("pazar") || day.equals("cumartesi"))){
            System.out.println("Lutfen gecerli bir gun giriniz");

        }





    }
}
