package Combo_10StringManipulation;

public class Seju_Liss_Ashe_SManipulation {
    public static void main(String[] args) {

        String str="Java ogrenmek ne guzel";

        System.out.println(str.charAt(0)); //ilk harfi yazdirir

        System.out.println(str.toUpperCase().charAt(7)); //7.harfi buyuk yazdirir 'R'

        System.out.println(str.charAt(21)); // 'l' yi verir

        // System.out.println(str.charAt(22)); // hata verir
        // son harf icin strnin uzunlugunun 1 eksigini index olarak gireriz
        // eger index olarak uzunlugu veya daha yuksek bir sayi girersek Java exception verir

        // charAt() kullandigimizda sonuc char olacagi icin manipulation yapilmaz
        // String methodlarini kullanmak istiyosak charAt() den once kullanmaliyiz
    }
}
