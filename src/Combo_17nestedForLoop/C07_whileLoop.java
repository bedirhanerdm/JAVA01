package Combo_17nestedForLoop;

public class C07_whileLoop {
    public static void main(String[] args) {

        //20den 50ye kadar sinirlar dahil cift sayilari yazdiralim

        int bas=20;
        int bitis=50;

        for (int i=bas; i<=bitis; i++){
            if (i%2==0){
                System.out.print(i + " ");
            }
        }

        int temp=bas;
        while (temp<=bitis){
            if (temp%2==0){
                System.out.print(temp + " ");
            }
            temp++;
        }

    }
}
