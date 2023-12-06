package Combo_26Constructor;

public class Kamyon {


    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;


    // sag click, generate, constructor

    public Kamyon(String marka, String model, int yil, int fiyat) {
        this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.fiyat=fiyat;
    }


    public Kamyon(){

    }


    // Sag click, generate, toString, sonrasinda duzenle

    @Override
    public String toString() {
        return "" +
                "marka= " + marka +
                "\nmodel= " + model +
                "\nyil= " + yil +
                "\nfiyat= " + fiyat;
    }



}
