package Combo_38exceptions;

public class C02_Exceptions {

    public static void main(String[] args) {

         /*
        try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz
                  islemleri yazmak icin kullanilir
        catch'den sonraki parantez karsilasmayi bekledigimiz exception
                  turunu Javaya soylemek icin kullanilir
        catch blogu  : Java'ya soyledigimiz exception(isnisnai durum) gerceklesirse
                   Java'nin yapmasini istedigimiz islem
         */

        int a= 1000;

        int b= 50;

        int sayac = 1;


        while(sayac<100){

            try {

                System.out.println(a/b);

            } catch (Exception e) {

                System.out.println("payda 0 oldu, dikkatli ol");
            }

            b--;

            sayac++;
        }

    }

}
