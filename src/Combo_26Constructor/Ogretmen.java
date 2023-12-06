package Combo_26Constructor;

public class Ogretmen {

    public String isim;
    public String soyIsim;
    public String dogumTarihi;
    public String brans;
    public String yanBrans;



    public Ogretmen(String isim, String soyIsim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public Ogretmen(){

    }


    @Override
    public String toString() {
        return
                "isim= " + isim +
                "\nsoyIsim= " + soyIsim +
                "\ndogumTarihi= " + dogumTarihi +
                "\nbrans= " + brans +
                "\nyanBrans= " + yanBrans;
    }
}
