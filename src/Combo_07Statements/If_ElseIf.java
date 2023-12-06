package Combo_07Statements;

import java.util.Scanner;

public class If_ElseIf {
    public static void main(String[] args) {

        /*
        bir onceki soruda kullanici negatif girerse uyaralim
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int age=scan.nextInt();

        if ((age<=0) || (age>=130)){
            System.out.println("Lutfen gecerli bir yas giriniz..");
        } else if (age >= 65) {
            System.out.println("Emekli olabilirsiniz Sn. Yasuo");
        } else {
            System.out.println("Emekli olamazsiniz," + (65 - age) + " yil daha calismalisiniz,is basina.");
        }
    }
}
