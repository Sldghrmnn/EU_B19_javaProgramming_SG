package day21_ReturnMethods_MethodOverloading;

public class C03_NameOfMonth {
    public static void main(String[] args) {

        System.out.println(nameOfMonth(5));
    }
// bir tane metod yazicaz. Method'a bir sayi vericegiz
// ve o sayinin karsiligindaki hangi ay'a denk geldigini yapan method olacak.

    public static String nameOfMonth(int num){
        String month = "";

        if (num>=1 && num<=12){

            if (num ==1) {
                month = "Ocak";
            }else if (num==2){
                month= "Subat";
            }else if (num==3){
                month= "Mart";
            }else if (num==4){
                month= "Nisan";
            }else if (num==5){
                month= "Mayis";
            }else if (num==6){
                month= "Haziran";
            }else if (num==7){
                month= "Temmuz";
            }else if (num==8){
                month= "Agustos";
            }else if (num==9){
                month= "Eylul";
            }else if (num==10){
                month= "Ekim";
            }else if (num==11){
                month= "Kasim";
            }else  {
                month= "Aralik";
            }
        }else{
            month= "Gecersiz Sayi girdiniz";
        }
        
        return month;
    }


public static String aylarinAdi(int num){

        return switch (num) {
            case 1 -> "Ocak";
            case 2 -> "Subat";
            case 3 -> "Mart";
            case 4 -> "Nisan";
            case 5 -> "Mayis";
            case 6 -> "Haziran";
            case 7 -> "Temmuz";
            case 8 -> "Agustos";
            case 9 -> "Eylul";
            case 10 -> "Ekim";
            case 11 -> "Kasim";
            case 12 -> "Aralik";
            default -> "Gecersiz ay!";
        };
}














}
