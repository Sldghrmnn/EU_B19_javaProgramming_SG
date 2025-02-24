package day30_Arrays01;

public class C04_HaftaninGunleri {
    public static void main(String[] args) {
        String [] gunler = new String[7];

        gunler[0]="Pazartesi";
        gunler[1]="Sali";
        gunler[2]="Carsamba";
        gunler[3]="Persembe";
        gunler[4]="Cuma";
        gunler[5]="Cumartesi";
        gunler[6]="Pazar";

        System.out.println("gunler[3] = " + gunler[3]);

        System.out.println("gunler.length = " + gunler.length);
    }
}
