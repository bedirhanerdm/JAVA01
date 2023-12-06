package Combo_42abstractClass_interfaces;

public class K_ChildOfInterfaces implements I02_interfaces, I03_interfaces{

    /*
    Bir class i bir interface e child yapmak icin implements keyword kullanilir.
    interfaceden interface e ise extends.
    implements dedikten sonra virgul ile istedigimiz kadar interface ekleyebiliriz.

     */

    public static void main(String[] args) {

        System.out.println("2.deki variable:" + I02_interfaces.SAYI);
        System.out.println("3.deki variable:" + I03_interfaces.SAYI);

    }

    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}
