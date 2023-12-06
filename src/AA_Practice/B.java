package AA_Practice;

import java.util.Scanner;

public class B {

    public static void aracFields(){

        String[] marka = {"opel", "toyota", "volvo"};
        String[] model = {"astra", "corolla", "s60"};
        String[] yakitTipi = {"dizel", "benzin"};
        String[] vites = {"manuel", "otomatik"};
        Double[] gunlukUcret = {100.0,120.0,150.0};
        Double[] listeDisiAracUcret = {300.0};

        Scanner scan = new Scanner(System.in);
        System.out.println("Opel Astra icin 1 e, Toyota Corolla icin 2 ye, Volvo S60 icin 3 e basin, farkli " +
                "bir arac istiyorsaniz 4e basin");

        int kullaniciMarka = scan.nextInt();


        System.out.println("Yakit tipi dizel icin 1e, benzinli icin 2ye basin");
        int kullaniciYakit = scan.nextInt();


        System.out.println("Manuel vites icin 1 e, otomatik icin 2ye basin");
        int kullaniciVites = scan.nextInt();

        if (kullaniciMarka==1){

            System.out.println("Sectiginiz arac marka ve modeli: " + marka[0] + model[0]);

            if (kullaniciYakit==1){

                System.out.println("Aracin yakit tipi:" + yakitTipi[0]);

            } else if (kullaniciYakit==2) {

                System.out.println("Aracin yakit tipi:" + yakitTipi[1]);

            }


        }



    }

}
