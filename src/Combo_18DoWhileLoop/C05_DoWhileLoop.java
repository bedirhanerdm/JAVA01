package Combo_18DoWhileLoop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {


        // 9 dan 190a kadar 7nin katlarini yazdir

        int bas=9;
        int bitis=190;

        int temp=bas;

        //while loop ile

        while (temp<bitis){

            if (temp%7==0){
                System.out.print(temp + " ");
            }
            temp++;
        }

        // do while loop ile

        System.out.println("");
        temp=bas;

        do {
            if (temp%7==0){
                System.out.print(temp+" ");

            }
            temp++;
        }while (temp<bitis);
    }
}
