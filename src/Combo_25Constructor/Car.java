package Combo_25Constructor;

public class Car {

    /*

    Bu class kalip class i
    bir araba olusturmak icin ihtiyacimiz olan variable ve methodlari bu classta belirleriz
    sonra farkli classlarda araba olusturmamiz gerekirse bu classtan bir obje olusturup burada belirlenen
    variable ve methodlara gore araba uretiriz

     */

    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;


    public void benzinliArac(){

        System.out.println("Bu arac benzinli motora sahiptir");

    }

    public void maxHiz(int hiz){

        System.out.println("Bu arac maksimum "+hiz+" km hiz yapmaktadir");

    }










}
