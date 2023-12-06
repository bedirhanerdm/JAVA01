package Combo_04Casting;

public class Odev7 {
    public static void main(String[] args) {
        int i=34;
        double d=22.3;
        char ch='O';
        String st="smani optum";

        System.out.println(i+d); //56.3
        System.out.println(i+ch); //113
        System.out.println(ch+st); //Osmani optum
        System.out.println(d+st); //22.3smani optum
        System.out.println(d+ch); //101.3
    }
}
