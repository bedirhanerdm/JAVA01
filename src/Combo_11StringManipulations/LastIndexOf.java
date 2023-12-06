package Combo_11StringManipulations;

public class LastIndexOf {
    public static void main(String[] args) {

        String cumle="Java cok kolay, Java cok guzel";
        String kelime="Java";

        /*
        verilen kelime icin sartlardan uygun olani yaz

        -verilen kelime cumleye yok
        -verilen kelime cumlede bir kere kullanilmis
        -verilen kelime cumlede birden fazla kullanilmis
         */

        int kelimeIlkIndex = cumle.indexOf(kelime);
        int kelimeSonIndex = cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("kelime cumlede yok");

        } else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("kelime 1 kere kullanilmis");

        } else {
            System.out.println("kelime birden fazla kullanilmistir");
        }
    }
}
