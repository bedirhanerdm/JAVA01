package Combo_39exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {

    /*
    Javadan = bilgisayarimizdaki bir dosyaya erismek istiyorsak
    FileInputStream Classindan yardim aliriz.

    Ayni sekilde Javadan laptoptaki bir dosyaya ekleme veya update icin
    FileOutputStream Classden yardim aliriz.
     */

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("src/Combo_39exceptions/Test.txt");

        /*

        Goruldugu gibi compile time da altini kirmizi cizen her durum
        Compile Time Error degildir,
        Javada bazi exceptionlar da Compile time Exceptiondur
        ozellikle dosya okuma ve yazma ile ilgili exceptionlar
        Compile Time Exceptiondur.

        Compile Time Exception olustugunda Java cozum icin 2 ihtimal onerir,
        1- Try Catch yapmak
        2- Mehtod signature'ina throws keyword ile beklenen ezception turunu yazmak

        Throws exception, sadece olayin farkinda oldugumuzun deklarasyonudur,
        exceptionun handle edilmesinde hic bir rolu yoktur.
        Yani try catch ile handle ettigimiz exceptionlarda
        kod calismaya devam ediyordu.
        Ancak throws exceptionda Java bir exceptionla karsilasirsa hicbir sey yapmamisiz gibi
        hata mesaji yayinlayip calismayi durdurur.

         */


    }
}
