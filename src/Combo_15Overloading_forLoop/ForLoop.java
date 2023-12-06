package Combo_15Overloading_forLoop;

public class ForLoop {
    public static void main(String[] args) {

        //1den 5e kadar (5 dahil) olan tamsayilari toplayalim
        int toplam=0;

        for(int i = 1 ; i<=5 ; i++){ //i 6ya kadar dongu devam 6 olunca iptal.

            toplam+=i;

        }
        System.out.println("Sayilarin toplami= " + toplam);
        toplam=0;

        // 10 ve 20 dahil aradaki sayilari topla

        for ( int i = 10; i <= 20; i++ ){
            toplam+=i;
        }
        System.out.println("Sayilarin toplami= " + toplam);
        toplam=0;

        //30 50 dahil arasindaki cif sayi topla

        for ( int i=30 ; i<=50 ; i++){
            if (i%2==0){
                toplam+=i;
            }
        }
        System.out.println("Sayilarin toplami= " + toplam);
        toplam=0;


        //1500 ile 1700 dahil arasindaki 7ye bolunenleri topla

        for (int i=1500; i<=1700; i++){
            if (i%7==0){
                toplam+=i;
            }
        }
        System.out.println("Sayilarin toplami= " + toplam);
    }
}
