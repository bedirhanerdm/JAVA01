package Combo_20Arrays;

public class C03_length {
    public static void main(String[] args) {

        // iki sekilde array olusturabiliriz
        int sayilar[]={1, 2, 3}; // direkt olusturma

        String harfler[] = new String[4]; // length ile olusturma

        System.out.println("Sayilar array'inin uzunlugu= " + sayilar.length); //3

        System.out.println("Harfler arrayinin uzunlugu= " + harfler.length); //4

        // harfler arrayinin son elementini yazdiralim

        System.out.println(harfler[harfler.length-1]);

        System.out.println(harfler[5]); // icerdigi indexten fazla index girince OutOfBoundsException

    }
}
