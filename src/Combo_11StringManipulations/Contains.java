package Combo_11StringManipulations;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {

        /*
        Kullanicidan email adresini girmesini isteyin,
        mail @gmail.com icermiyorsa "lutfen gmail adresi giriniz",
        @gmail.com ile bitiyorsa "Email adresiniz kaydedildi " ,
        @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz");
        String email=scan.nextLine();

        if (!email.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz");

        } else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {
            System.out.println("Gmail adresiniz kaydedildi");


        } else {
            System.out.println("Yazimi kontrol ediniz..");

        }
    }
}
