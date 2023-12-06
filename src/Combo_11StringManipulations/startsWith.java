package Combo_11StringManipulations;

public class startsWith {
    public static void main(String[] args) {

        String cumle="Abi cok iyi yaa";

        System.out.println(cumle.startsWith("A")); // true

        System.out.println(cumle.startsWith("")); // true

        System.out.println(cumle.startsWith("iyi",8)); // true, 9. karakterden sonrasi cumlenin
                                                                   // geri kalaninin baslangici
    }
}
