package Combo_24ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ArraydenArrayListYapmak {

    public static void main(String[] args) {

        String[] arr={"Ismail", "Nurullah", "Fatih"};

        /*
        Uzun listeler yapilacagi zaman tek tek eklemek yerine array olusturup
        bunlari list e cevirmek daha pratiktir

        1- loop ile arraydeki tum elementleri List e atabiliriz
        2- Array.asList() kullanabiliriz fakat bunun kotu yan etkileri var
         */

        List<String> arr2 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            arr2.add(arr[i]);

            }
        System.out.println(arr2);

        }
    }
