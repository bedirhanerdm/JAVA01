package Combo_13MethodCreation;

public class C01_String_Manipulation {
    public static void main(String[] args) {

        String str1= "$13.99";
        String str2= "$10.55";


        str1=str1.replaceAll("\\D","");
        double sayi1=Double.parseDouble(str1);
        System.out.println(sayi1/100);

        str2=str2.replaceAll("\\D","");
        double sayi2=Double.parseDouble(str2);
        System.out.println(sayi2/100);

        System.out.println((sayi1+sayi2)/100);
    }
}
