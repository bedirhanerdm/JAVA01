package Combo_24ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoop {

    public static void main(String[] args) {

        int[] arr= {2,3,4,6,23,6,8,9,1};
        List<Integer> liste=new ArrayList<>();

        // arraydeki tum elemanlari incele, tek sayilari liste atalim

        for (int each: arr    // gelecek datalarin turu, loop icinde verilecek isim ve nereden aldik
             ) {

            if (each%2==1){
                liste.add(each);
            }
            }
        System.out.println(liste);
        }

    }
