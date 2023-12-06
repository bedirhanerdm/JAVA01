package Combo_11StringManipulations;

import java.util.Scanner;

public class endsWith2 {
    public static void main(String[] args) {

        /*
        Kullanicidan email adresini girmesini isteyin,
        -mail @gmail.com icermiyorsa "lutfen gmail adresi giriniz",
        -@gmail.com ile bitiyorsa "Email adresiniz kaydedildi " ,
        -@gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gmail adresinizi giriniz");
        String mail=scan.nextLine();

        if (!mail.contains("gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz.");

        } else if (mail.endsWith("gmail.com")) {
            System.out.println(mail+" Email adresiniz kaydedildi UwU");

        }else {
            System.out.println("Lutfen mail adresinizi kontrol ediniz ^^");
        }
    }
}
