package Combo_11StringManipulations;

public class sej_lis_ashe_nunu_IndexOf {
    public static void main(String[] args) {

        String str= "Java ogrenmek cok guzel";

        /*
        kullanilan String veya char in ilk kullanildigi indexi bize geri dondurur
         */

        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("r")); // 7
        System.out.println(str.indexOf("j")); // -1 cunku buyuk J olmali

        System.out.println(str.indexOf("mek")); // 10

        //2. ve 3. e'leri bul

        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e",ilke+1);

        if (ikincie==-1){
            System.out.println("Verilen str'de 2. 'e' yok");

        }else {
            int ucuncue=str.indexOf("e", ikincie+1);
            if (ucuncue==-1){
                System.out.println("Verilen str'de 3. 'e' yok");

            }else{
                System.out.println("Verilen str'deki 3. e nin indexi = " + ucuncue);
            }
        }
    }
}
