package day21_ReturnMethods_MethodOverloading;

public class C03_NameOfMonth {
    public static void main(String[] args) {

        System.out.println(nameOfMonth(5));
    }


    public static String nameOfMonth(int num){
        String month = "";
        if (num ==1) {
            month ="Ocak";
        }else if (num==2){
            month="Subat";
        }else if (num==3){
            month="Mart";
        }else if (num==4){
            month="Nisan";
        }else if (num==5){
            month="Mayis";
        }else if (num==6){
            month="Haziran";
        }else if (num==7){
            month="Temmuz";
        }else if (num==8){
            month="Agustos";
        }else if (num==9){
            month="Eylul";
        }else if (num==10){
            month="Ekim";
        }else if (num==11){
            month="Kasim";
        }else if (num==12) {
            month = "Aralik";
        }else
            System.out.println("Bir denklesme yok!");


        return month;
    }

















}
