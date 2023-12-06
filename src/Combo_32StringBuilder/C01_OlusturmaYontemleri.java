package Combo_32StringBuilder;

public class C01_OlusturmaYontemleri {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder(); // 1. Yontem ,  Bos String builder

        StringBuilder sb2 = new StringBuilder("Java Candir");  // 2. Yontem ,  atanmis String Builder

        StringBuilder sb3 = new StringBuilder(10);  // 3. Yontem ,  String Builder uzunlugu


        System.out.println(sb1.length());  // 0

        System.out.println(sb1.capacity());  // 16

        System.out.println(sb1);



        System.out.println(sb2.length());  // 11

        System.out.println(sb2.capacity());  // 27

        System.out.println(sb2);



        System.out.println(sb3.length());  // 0

        System.out.println(sb3.capacity());  // 10

        System.out.println(sb3);



        System.out.println("");



        sb1.append("Java");

        System.out.println(sb1.length());  // 4

        System.out.println(sb1.capacity());  // 16

        System.out.println(sb1);



        sb2.append(" Candir");

        System.out.println(sb2.length());  // 18

        System.out.println(sb2.capacity());  // 27

        System.out.println(sb2);



        sb3.append(", bilen bilir.");

        System.out.println(sb3.length());  // 14

        System.out.println(sb3.capacity());  // 22

        System.out.println(sb3);

    }

}
