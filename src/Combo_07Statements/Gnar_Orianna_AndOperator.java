package Combo_07Statements;

public class Gnar_Orianna_AndOperator {
    public static void main(String[] args) {

        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b); //hepsi dogru sonuc true

        System.out.println(a<0 && b<20 && c>=b); //false gordugu an sonuc false

        System.out.println(a<0 & b<20 & c>=b); //false olur ve hepsine baktigi icin yavas calisir

    }
}
