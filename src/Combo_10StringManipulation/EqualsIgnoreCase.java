package Combo_10StringManipulation;

public class EqualsIgnoreCase {
    public static void main(String[] args) {

        String str1="Ali Can";
        String str2="ali can";
        String str3="ALI CAN";
        String str4="Ali Can_";

        System.out.println(str1.equals(str2)); // false

        System.out.println(str1.equalsIgnoreCase(str2)); // true

        /*

        buyuk harf ve kucuk harfi gormezden geliyor

         */


        System.out.println(str2.equals(str3)); // false

        System.out.println(str2.equalsIgnoreCase(str3)); // true


        System.out.println(str1.equals(str4)); // false

        System.out.println(str1.equalsIgnoreCase(str4)); // false

    }
}
