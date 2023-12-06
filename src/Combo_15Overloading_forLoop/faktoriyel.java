package Combo_15Overloading_forLoop;

public class faktoriyel {
    public static void main(String[] args) {

        /*
        input olarak verilen tam sayinin faktoriyelini hesaplayan method
        sayi 0, negatif veya 20den buyuk olursa uyari yazdir
         */
        int input=10;
        faktoriyelHesapla(input);
    }

    public static void faktoriyelHesapla(int input) {

        int faktoriyel=1; //carpilacagi icin 0 olmasin

        if (input<0 || input>20){
            System.out.println("Verilen sayi icin faktoriyel hesaplanamaz.");

        } else if (input==0) {
            System.out.println("0! = 1'dir.");

        }else {

            for (int i = 1; i <= input; i++){
                faktoriyel*=i;
            }
            System.out.println(input + " sayisinin faktoriyel degeri= " + faktoriyel);
        }
    }
}
