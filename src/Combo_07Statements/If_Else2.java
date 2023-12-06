package Combo_07Statements;

import java.util.Scanner;

public class If_Else2 {
    public static void main(String[] args) {

        /*
        yas sorun, 65den buyukse emekli olabilirsin, kucukse emekli olamazsin yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int age = scan.nextInt();

        if (age >= 65) {
            System.out.println("Emekli olabilirsiniz Sn. Yasuo");
        } else {
            System.out.println("Emekli olamazsiniz," +(65-age)+" yil daha calismalisiniz,is basina.");
        }
    }
}
