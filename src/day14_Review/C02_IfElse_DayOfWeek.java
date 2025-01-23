package day14_Review;

public class C02_IfElse_DayOfWeek {
    public static void main(String[] args) {

        int dayOfWeek = 4;
        String gunler ="";

        if (dayOfWeek ==1){
            gunler = "Pazartesi";
        }else if (dayOfWeek==2){
            gunler = "Sali";
        }else if (dayOfWeek==3){
            gunler = "Carsamba";
        }else if (dayOfWeek==4){
            gunler = "Persembe";
        } else if (dayOfWeek==5) {
           gunler = "Cuma" ;
        } else if (dayOfWeek==6) {
           gunler = "Cumartesi" ;
        } else if (dayOfWeek==7) {
           gunler = "Pazar" ;
        }else {
            System.out.println("Yanlis giris yaptiniz.");
        }

        if (dayOfWeek>=1 && dayOfWeek <= 7){
            System.out.println("Bugun gunlerden " +gunler+" 'dir.");
        }

    }
}
