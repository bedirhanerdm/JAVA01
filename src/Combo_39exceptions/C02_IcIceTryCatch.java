package Combo_39exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IcIceTryCatch {

    public static void main(String[] args) {

        int k;

        try {

            FileInputStream fis = new FileInputStream("src/Combo_39exceptions/Test.txt");


            while ((k=fis.read()) != -1){

                System.out.print((char)k);

            }

        } catch (FileNotFoundException e) {

            System.out.println("Dosya bulunamadi");

        } catch (IOException e) {  // FileNotFoundException ile bunun yerini degisirsek uyari verir
                                   // Cunku IO daha genis kapsamli, child parent durumu var

            System.out.println("Dosyadan bilgiler okunamadi");

        }


    }
}
