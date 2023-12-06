package Combo_10StringManipulation;

public class Equals {
    public static void main(String[] args) {

        String str1= "Ali Can";
        String str2= "Ali CAN";
        String str3= "Ali Can" + "";
        String str4= "Ali Can";
        String str5= new String("Ali Can");

        System.out.println(str1==str2); // False

        System.out.println(str1==str3); // True

        System.out.println(str1.equals(str3)); // True


        System.out.println(str1==str5); // False

        System.out.println(str1.equals(str5)); // True


        System.out.println(str1.equals(str3)); // True

        System.out.println(str3==str5); // False


        /*

        Stringler ayni olsa bile double equal sign her zaman calismaz
        emin olmak icin equals() methodu kullanilmali

        equals() kullanildiginda dikkat edilecek tek sey metinlerin bire bir ayni olmasidir.

         */

    }
}
