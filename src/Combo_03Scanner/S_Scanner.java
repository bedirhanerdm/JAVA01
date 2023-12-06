package Combo_03Scanner;

import java.util.Scanner;

public class S_Scanner {
    public static void main(String[] args) {
        //isim iste
        //ismi yazdır

        //Scanner objesi oluştur
        Scanner scan = new Scanner(System.in);

        //output yap
        System.out.println("Lütfen isminizi giriniz..");

        // Oluşturduğumuz scan objesi ile kullanıcının girdiği değeri alıp
        // Oluşturacağımız uygun bir variable'a atayalım.
        String kullaniciIsmi = scan.next();

        System.out.println("Isminiz " + kullaniciIsmi);
    }



}
