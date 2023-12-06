package Combo_12stringManipulations;

public class alistar_veigar_replace {
    public static void main(String[] args) {

        String str= "Bu gun ha va cok guz el";
        System.out.println(str.replace(" ",""));

        //Hava kelimesi Java olsun

        System.out.println(str.replace("h","J")
                .replace(" ",""));

        //guz el yerine harika olsun

        System.out.println(str.replace("guz el","harika"));

        //cumleyi replace kullanarak "Bugun Java cok guzel" yapalim

        System.out.println(str.replace("Bu gun", "Bugun")
                .replace("ha va", "Java")
                .replace("guz el", "guzel"));
    }
}
