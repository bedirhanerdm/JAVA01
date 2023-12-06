package Combo_25Constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {

    public static void main(String[] args) {

        C01 obj1 = new C01(); // en sagdaki paranteze constructor denir
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        List<String> list1 = new ArrayList<>();

        /*
        Java da bir obje olusturmak istiyorsaniz constructor olusturulmasi lazim
         */

        System.out.println(obj1.sayi); // 0

        obj1.deneme();  // C01 den dogru calisir
    }
}
