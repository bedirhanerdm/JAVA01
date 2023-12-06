package Combo_42abstractClass_interfaces;

public interface I03_interfaces {

    /*
    int i = 10;

    interface classlarda variable a deger atamak lazim cunku bu variable lar
    final olarak olusuyor.
     */

    int SAYI = 20;

    void yakit();

    /*
    interface olan her method public, abstract ozelliklere sahiptir.
    interface olan variablelar ise public, statik ve final ozellige sahiptir.

    abstract bir methodun bodysi olmaz fakat java developerlar icin kismi bir update
    yapmistir.

    Bir interface e sonradan abstract method eklerseniz sonraki tum classlarda override
    gerektirir,
    Bu da buyuk projeler icin cok zordur.

    Bunun icin Java Java8den itibaren interfacelere sonradan bodyli bir method eklemeye
    izin vermistir.

    ....
     */

    abstract void motor();

    public void teker();


}
