package Combo_15Overloading_forLoop;

public class ForLoop2 {
    public static void main(String[] args) {

        StringTerseCevirme.terstenYazdir("Ahmet Bedirhan Erdem");

        //100den 1e kadar bunlar dahil, 8 ile bolunebilen sayilari yazdirin


        for (int i=100; i>=1; i--){
            if (i%8==0){
                System.out.print(i +" ");
            }
        }
    }
}
