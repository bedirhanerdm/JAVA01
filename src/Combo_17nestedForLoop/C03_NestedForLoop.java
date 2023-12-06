package Combo_17nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen en boy degerine gore
        *lardan olusan dikdortgen yapalim
         */

        int boy=4;
        int en=8;

        for (int i = 1; i<=boy; i++){
            for (int j=1; j<=en; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
