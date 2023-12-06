package Combo_12stringManipulations;

public class replaceAll {
    public static void main(String[] args) {

        String str="1Bu2gu3n Ja*va- cok g3uz/el";

        /*
         str i Bugun Java cok guzel yapalim
         - replaceAll() all un amaci tum ayni ozellikteki karakterleri kapsamasidir
         - tum sailari sil && tum karakterleri sil
         - \\s : space siler
         - \\S : space haric siler
         - \\w : harf ve rakam siler
         - \\W : harf rakam disindaki her sey
         - \\d : digit(rakamlar)
         - \\D : rakam disi her sey
        */

        // tum ozel karakterleri silersek space de gider
        // o yuzden once spaceleri cumlede olmayan bir String ile degiselim

        str=str.replace(" ", "x");  // 1Bu2gu3nxJa*va-xcokxg3uz/el
        System.out.println(str);

        str=str.replaceAll("\\W", "");  // 1Bu2gu3nxJavaxcokxg3uzel
        System.out.println(str);

        str=str.replaceAll("\\d","");  // BugunxJavaxcokxguzel
        System.out.println(str);

        //karakterlerden vs kurtulduktan sonra spaceleri geri getir

        str=str.replace("x", " "); // Bugun Java cok guzel

        System.out.println(str);







    }
}
