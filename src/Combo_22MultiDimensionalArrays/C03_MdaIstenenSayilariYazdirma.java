package Combo_22MultiDimensionalArrays;

public class C03_MdaIstenenSayilariYazdirma {

    public static void main(String[] args) {

        // Verilen 2 katli bir MDA'da outer ve inner indexi ayni olan sayilar toplamini bulunuz
        // ORN = [0][0] + [1][1] + [2][2].......

        int[][] sayilar = {{1,5,6,9,4},{2,5,5,8},{3,1,6}};

        int istenenToplam = 0;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {

                if (i==j){
                    istenenToplam+=sayilar[i][j];
                }
            }

        }

        System.out.println("Istenen Toplam = " + istenenToplam);

    }
}
