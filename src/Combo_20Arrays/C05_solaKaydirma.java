package Combo_20Arrays;

import java.util.Arrays;

public class C05_solaKaydirma {
    public static void main(String[] args) {

        /*
        3 elemanli bir arrayin tum elemanlarini bir soldaki konuma tasiyacak
        bir program yazin
        ornek array[1,2,3] ise output [2,3,1] olacak
        */

        int sayilar[]={1,2,3};

        int temp=sayilar[0];

        for (int i = 0; i < sayilar.length-1; i++){

            sayilar[i]=sayilar[i+1];
        }

        sayilar[sayilar.length-1]=temp;

        System.out.println(Arrays.toString(sayilar));




        // arrayi eski haline dondurelim

        temp=sayilar[sayilar.length-1];

        for (int i = sayilar.length-1; i>0; i--){

            sayilar[i]=sayilar[i-1];
        }

        sayilar[0]=temp;
        System.out.println(Arrays.toString(sayilar));



    }
}
