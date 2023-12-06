package Combo_42abstractClass_interfaces;

import java.util.ArrayList;
import java.util.List;

public interface I02_interfaces {

    /*
    interface bir class degildir

    Abstract classlar javada abstractio (soyutlastirma / kural koyma)
    islevini yapiyordu
    Ancak abstract bir classda abstract olmayan methodlar da olabilir
    bu da full abstraction a izin vermez

    Javada hic concrete method olmasin dedigimiz bir class olusturmak istiyorsaniz
    bunu class degil interface yapmalisiniz.

    INTERFACELERDE CONCRETE METHOD OLMAZ
    Interface olan listten direkt obje olusturulamaz
    Hatirladiginiz gibi Interface olan List'den direk obje olusturamiyorduk

       List<String> liste = new List<>();  calismaz
       Bunun yerine constructor'i List'in child'i olan ArrayList'den seceriz

       List<String> liste = new ArrayList<>();

    3- Class'larda bir child birden fazla parent edinemez
       Ancak Interface'lerde concrete method olmadigindan
       biz her methodu child class'da override etmek zorundayiz,
       Override ederken kimin soyledigini override ettigimizin onemi yok

    4- Interface'ler neyin yapilmasi gerektigini soyler
       ama nasil yapilacagina karismaz

     */

    List<String> liste = new ArrayList<>();

    int SAYI = 30;


}
