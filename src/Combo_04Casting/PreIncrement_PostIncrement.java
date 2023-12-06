package Combo_04Casting;

public class PreIncrement_PostIncrement {
    public static void main(String[] args) {

        int x=10;

        int y=x+1;
        y+=5; // y=16
        /*
        pre veya post inc/dec sadece ++ ve -- islemi icin gecerli.
         */

        int z=y++; //1. y bir artirilacak, 2. zye yansitilacak.

        int w=++x; //1. x bir artirilacak, 2. wya yansitilacak

    }
}
