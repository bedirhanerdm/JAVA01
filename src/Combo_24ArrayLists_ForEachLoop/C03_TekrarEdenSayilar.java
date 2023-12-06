package Combo_24ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayilar {

    public static void main(String[] args) {

        // arraydeki tekrar eden elementleri yazdirin

        int[] arr= {2,3,5,6,3,5,4,1,9,6,3};

        // sort ile cozelim

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 3, 3, 4, 5, 5, 6, 6, 9]


        List<Integer> tekrarEdenler = new ArrayList<>();



        for (int i = 0; i < arr.length-1; i++) { //arr + 1 dedigimiz icin sona geldiginde hata verecekti, o yuzden lenght - 1

            if (arr[i]==arr[i+1] && !tekrarEdenler.contains(arr[i])){

                System.out.print(arr[i] + " ");
                tekrarEdenler.add(arr[i]);

            }
        }




    }
}
