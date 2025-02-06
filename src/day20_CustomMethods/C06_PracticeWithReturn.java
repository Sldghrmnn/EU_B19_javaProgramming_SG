package day20_CustomMethods;

public class C06_PracticeWithReturn {
    public static void main(String[] args) {

        System.out.println(tekSayilar());

        System.out.println(isEligibleToAlcohol(24));

        if (isEligibleToAlcohol(25)){
            System.out.println("alkol zararlidir!!!");
        }


        System.out.println(ciftSayilar());

    }

    /**
     * this method returns to the odd numbers btw 1-100
     *
     * @return
     */

    public static String tekSayilar(){
        String result =" ";
        for (int i = 1; i <= 100 ; i +=2) {
            result += i+" ";
        }
        return result;
    }

    /**
     * 1-100 arasi cift sayilar
     *
     * @return
     *
     */
    public static String ciftSayilar(){
        String sonuc = "";
        for (int i = 0; i <= 100; i +=2) {
            sonuc += i +" ";
        }

        return sonuc;
    }



    //3.create a method that can check if a person is eligible to buy alcohol

    public static boolean isEligibleToAlcohol(int age){
        boolean isEligible = false;
        if (21<= age){
            isEligible = true;
        }else{
            isEligible = false;
        }

        return isEligible;
    }
}
