package Combo_18DoWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {


        int sayi=32543;
        int rakamlarToplami=0;
        int birlerBasamagi=0;

        int temp=sayi;

        while (temp>0){

            birlerBasamagi=temp%10;

            rakamlarToplami+=birlerBasamagi;

            temp/=10;

        }
        System.out.println("rakamlar toplami = " + rakamlarToplami);
    }
}
