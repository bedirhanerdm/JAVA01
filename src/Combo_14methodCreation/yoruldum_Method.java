package Combo_14methodCreation;

import Combo_13MethodCreation.C04_Method_Creation;

public class yoruldum_Method {
    public static void main(String[] args) {

        //input olarak girilen 4 harfli stringi tersten yazdiran method

        terstenyazdir("Okan"); //nako

        C04_Method_Creation.topla(6,5); //baska classlarda halihazirda bulunan public methodlari cagirabiliriz

    }

    public static void terstenyazdir(String input){

        String tersInput= input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        tersInput=tersInput.toLowerCase();

        System.out.println("Verilen kelimenin tersten yazilisi :" + tersInput);

    }
}
