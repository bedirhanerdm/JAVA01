package Combo_15Overloading_forLoop;

public class StringTerseCevirme {
    public static void main(String[] args) {

        //Input olarak verilen stringi terse cevirip yazdiran method

        String str="Java gun gectikce guzellesiyor";

        terstenYazdir(str);
    }

    public static void terstenYazdir(String str) {

        String tersInput=str.substring(str.length()-1);

        for (int i= str.length()-2; i>=0; i--){
            tersInput+=str.substring(i,i+1);
        }

        System.out.println(tersInput);

    }
}
