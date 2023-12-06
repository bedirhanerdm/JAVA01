package Combo_17nestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        /*
         verilen sayiya gore carpim tablosu olusturunuz

         input=3
         1 2 3
         2 4 6
         3 6 9
         */

        int input=5;

        for (int i = 1; i <= input; i++){
            for (int j = 1; j <= input; j++){

                System.out.print(i*j + " ");
            }
            System.out.println(""); //hepsini yana yazmasin diye, icteki for loop bitince bos satir atacak
        }

    }
}
