package Combo_29PassByValue_Immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {

    public static void main(String[] args) {

        /*

        Verilen 4 elemanli bir arrayi methoda gonderelim
        methodda yeni 3 elemanli bir array atayip bu yeni array e rastgele 100den kucuk 3 sayi atayalim
        methodda arrayi yazdiralim

        main methodda da method call dan sonra yeniden methodu yazdiralim

         */

        int[] arr = {3,5,8,10};

        arrayiDegistir(arr);

        System.out.println("method calldan sonra main methodda array: " + Arrays.toString(arr));

    }

    public static void arrayiDegistir(int[] arr) {

        arr = new int[3];
        Random rnd = new Random();
        arr[0] = rnd.nextInt(100);
        arr[1] = rnd.nextInt(100);
        arr[2] = rnd.nextInt(100);

        System.out.println("Methodda array: " + Arrays.toString(arr));
    }

}
