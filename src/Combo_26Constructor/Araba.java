package Combo_26Constructor;

public class Araba {

    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {
        marka=markaR;
        model=modelR;
        yil=yilR;
        fiyat=fiyatR;


    }

    /*
    Herhangi bir constructor olusturdugumuzda java default u siler
    Eger biz projemizde bir sorun yasanmasini istemiyorsak
    mutlaka default yerine parametresiz bir constructor olusturmaliyiz
     */

    public Araba(){

    }

    public void benzinliArac(){

        System.out.println("Bu arac benzinli motora sahiptir");

    }

    public void maxHiz(int hiz){

        System.out.println("Bu arac maksimum "+hiz+" km hiz yapmaktadir");

    }






}
