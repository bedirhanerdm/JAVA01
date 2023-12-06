package Combo_13MethodCreation;

public class C03_String_Manipulation3 {
    public static void main(String[] args) {

        /*

        methodlarla birlikte
        "    Java ogrenmek123 Cok guzel@    " Stringini
        "Java ogrenmek cok guzel." yazdirin
         */

        String str= "    Java ogrenmek123 Cok guzel@    ";

        str=str.trim(); //"Java ogrenmek123 Cok guzel@"

        str=str.replaceAll("\\d","");

        str=str.replace("C","c");

        str=str.replace("@",".");

        System.out.println(str);


    }
}
