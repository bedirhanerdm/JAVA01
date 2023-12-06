package Combo_12stringManipulations;

public class substring {
    public static void main(String[] args) {

        String isim="Suleyman";
        String soyIsim="Karanfil";
        String kartNo=" 1234 6589 7458 9658";

        System.out.println(isim.substring(3)); // eyman

        System.out.println(soyIsim.substring(soyIsim.length()-3)); //uzunluk 8 oldugu icin -3 ile 5 olur
                                                                            //sona kalan da substring(5) olur
                                                                            //yani fil yazdirir

        System.out.println(isim.substring(2,4)); // le

        // isim ve soyismin ilk harfini buyuk harf, geriye kalan * olsun
        // kredi kartinin ilk 4 rakami gorunsun geri kalan * olsun

        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKalan=isim.substring(1).replaceAll("\\w","*");

        String soyisimIlkHarf=soyIsim.substring(0,1).toUpperCase();
        String soyIsimKalan=soyIsim.substring(1).replaceAll("\\w","*");

        String kartNo4= kartNo.substring(0,4);
        String kartGeriKalan= " **** **** ****";

        System.out.println("Isim/Soyisim: "+isimIlkHarf+isimGeriyeKalan+" "+soyisimIlkHarf+soyIsimKalan
                +" kart no: "+kartNo4+kartGeriKalan);
    }
}
