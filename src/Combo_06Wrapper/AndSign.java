package Combo_06Wrapper;

public class AndSign {
    public static void main(String[] args) {

        /*
        && ile birlestirilen tum ifadeler dogru ise true olur, yanlis gordugu an sonucu yanlis girer
         */

        System.out.println((5 * 2 != 15) && (5>7)); //ilki dogru ikinci yanlis false olur
        System.out.println((12 * 8 > 55) && (3+7!=30));

        /*
        & yalniz basina kullanilir ise hepsini kontrol eder bu yuzden yavas calisir
         */
    }
}
