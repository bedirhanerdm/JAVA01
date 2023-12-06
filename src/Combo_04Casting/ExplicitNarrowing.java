package Combo_04Casting;

public class ExplicitNarrowing {
    public static void main(String[] args) {

        int x=500;

        byte y= (byte) x;

        /*
        Genis data turundeki degeri, dar data turundeki variable a atamak isterseniz,
        riski 0a indirgemek icin degerin onune istedigimiz data turunu yazmaliyiz.
         */

        System.out.println(y); //-12

        /*
        Bunun sebebi byte turunun destekledigi araliktir. -128 ile +127 arasinda destekleyen byte,
        -128i gecen bir sayi olursa (-130) bu sefer +127den geri gelir (+126).
        */

    }
}
