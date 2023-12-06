package Combo_27StaticKeyword;

public class C02 {

        static int x;
        int y;


        C02(){
            x+=2;
            y++;
        }


        static int getSquare(){
            return x * x;
        }


        public static void main(String[] args) {

            C02 sml = new C02();
            C02 sm2 = new C02();

            int z = sml.getSquare();

            System.out.print("-x" + z + "-y" + sm2.y);   // -x16-y1
        }

    }