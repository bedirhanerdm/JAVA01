package Combo_10StringManipulation;

import java.util.Locale;

public class LowertoUpperCase {
    public static void main(String[] args) {

        String str="Beni psikopata baglamayin";

        System.out.println(str.toUpperCase()); // BENI PSIKOPATA BAGLAMAYIN

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr"))); // BENİ PSİKOPATA BAGLAMAYİN

    }
}
