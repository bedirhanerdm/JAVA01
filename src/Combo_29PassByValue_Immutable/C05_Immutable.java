package Combo_29PassByValue_Immutable;

public class C05_Immutable {

    public static void main(String[] args) {

        String isim = "Mine";

        isim = isim.toUpperCase();

        System.out.println(isim); // MINE

        isim = "Mevlut";

        System.out.println(isim); // Mevlut
    }
}
