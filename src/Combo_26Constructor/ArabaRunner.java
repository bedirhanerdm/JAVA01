package Combo_26Constructor;

import Combo_25Constructor.Car;

public class ArabaRunner {

    public static void main(String[] args) {


        //Bir gun onceki car class indan obje olusturalim

        Car car1 = new Car();

        // onceki packagedeki variablelara ulasmak icin variable oncesinde public yazmamiz gerekiyor (Bkz. Combo25 Car)
        // degistirdim


        System.out.println(car1.fiyat); // atanmamis variable, 0


        // Araba class indan bir obje olusturdugumda eger default constructor kullanildiysa
        // tum ozellikler icin tek tek deger atamak zorunda kaliriz

        Araba araba1 = new Araba();


        araba1.fiyat=100000;
        araba1.marka="Mercedes";
        araba1.yil=2010;
        araba1.model="C180";

        System.out.println("Araba1 bilgileri:\nMarka: " + araba1.marka + "\nModel: " + araba1.model
                + "\nYil: " + araba1.yil + "\nFiyat: " + araba1.fiyat);


        System.out.println("");



        // Bir objeyi olustururken bazi ozelliklerini argument olarak belirtip bir obje olusturmak istersek Java itiraz eder.
        // Cunku her classta default constructor vardir ama parametresizdir
        // Bizim yeni ve parametreli constructorlara ihtiyacimiz var

        // Eger ki tek tek yazmakla ugrasmak istemiyorsak;


        Araba araba2 = new Araba("BMW", "5.20", 2011, 150000);

        System.out.println("Araba2 bilgileri:\nMarka: " + araba2.marka + "\nModel: " + araba2.model
                + "\nYil: " + araba2.yil + "\nFiyat: " + araba2.fiyat);

        System.out.println("");



        Araba araba3 = new Araba("Opel", "Astra", 2015, 78000);


        System.out.println("Araba3 bilgileri:\nMarka: " + araba3.marka + "\nModel: " + araba3.model
                + "\nYil: " + araba3.yil + "\nFiyat: " + araba3.fiyat);

        System.out.println("");



        Araba araba4 = new Araba("Audi", "A5", 2020, 50000);


        System.out.println("Araba4 bilgileri:\nMarka: " + araba4.marka + "\nModel: " + araba4.model
                + "\nYil: " + araba4.yil + "\nFiyat: " + araba4.fiyat);

    }
}
