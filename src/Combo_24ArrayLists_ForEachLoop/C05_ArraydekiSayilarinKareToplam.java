package Combo_24ArrayLists_ForEachLoop;

public class C05_ArraydekiSayilarinKareToplam {

    public static void main(String[] args) {

        // list deki sayilarin karelerini topla

        int[] arr= {2,3,4,1,5,7,6,5,4,3};

        int toplam = 0;

        for (int each:arr
             ) {
            toplam+=each*each;
        }
        System.out.println("Kareler toplami: " + toplam);
    }
}
