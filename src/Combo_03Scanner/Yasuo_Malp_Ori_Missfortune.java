package Combo_03Scanner;

public class Yasuo_Malp_Ori_Missfortune {
    public static void main(String[] args) {
        int sayi=10;
        char harf='a';
        String str="banan";

        System.out.println(sayi+harf); //10a değil 107 oldu
        System.out.println(sayi*harf); //ASCII Table devreye giriyor,
        // a'nın sayısal bir değeri var yani,
        // her harf ve karakter gibi
        System.out.println(str+harf); //banana oldu
        System.out.println(str + sayi + harf); //banan10a , string çok güjlü

        // eğer konsolda 10a yazdıracaksak...
        System.out.println("" + sayi + harf); //10a  "" hiçliktir (belveth)

    }
}
