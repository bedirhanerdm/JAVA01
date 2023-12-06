package Combo_06Wrapper;

public class Concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="guzeldir";
        int sayi1=5;
        int sayi2=4;

        System.out.println(str1+" "+str2+" "+sayi1+sayi2); //Java guzeldir 54
        System.out.println(str1+" "+str2+" "+(sayi1+sayi2)); //Java guzeldir 9
        System.out.println(sayi1+sayi2+" "+str1); //9 Java
        System.out.println(""+sayi1+sayi2+" "+str2); //54 guzeldir

        System.out.println(str1.concat(str2)); //Java guzeldir, concat + yerine gecerli birlestirme methodu,stringde gecerli
        System.out.println(str1.concat(" ").concat(str2)); //Java guzeldir
    }
}
