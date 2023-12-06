package Combo_22MultiDimensionalArrays;

public class C02_MdaTumElementleriYazdirma {

    public static void main(String[] args) {

        //Verilen multi dimensional array in tum elementlerini yazdir

        int[][] sayilar = {{1,5,6,9},{2,5},{3,1,6}};

        elementleriYazdir(sayilar);



    }

    public static void elementleriYazdir(int[][] sayilar) {

        for (int i = 0; i < sayilar.length; i++) { // i = 0,1,2 degerlerini alacak
            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.println(sayilar[i][j] + " ");

            }

        }
    }
}
