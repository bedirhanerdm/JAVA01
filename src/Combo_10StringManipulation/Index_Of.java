package Combo_10StringManipulation;

public class Index_Of {
    public static void main(String[] args) {

        String str= "Calisirsaniz Java kolay";

        System.out.println(str.indexOf('s')); // 4
        System.out.println(str.indexOf("s")); // 4

        System.out.println(str.indexOf("t")); // Integer sonuc buluyor, int olarak yok diye deger bulunmuyor
                                              // 0 dersek 'J' anlamina gelir o yuzden -1 yazdirilir

        String str2= "jakhfjadkvsfvbjhfsbikdgbjkihbklsdfahjkfbv sljhvnkjan";

        // str2'te p harfi var midir?

        if (str2.indexOf("p")==-1) {
            System.out.println("Istenen karakter kullanilmamis");

        } else {
            System.out.println("Istenen karakter kullanilmis");

        }

    }
}
