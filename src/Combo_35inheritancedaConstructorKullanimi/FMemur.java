package Combo_35inheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe{

    FMemur(){

        System.out.println("Memur parametresiz cons");

    }


    FMemur(String isim){

        System.out.println("Memur parametreli cons");

    }

    public static void main(String[] args) {

        FMemur mmr1 = new FMemur();  // yukari dogru tum parametresizler calisir (onceki extend yaptiklarimizdakiler)

    }
}
