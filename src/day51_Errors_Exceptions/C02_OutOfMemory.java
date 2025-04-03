package day51_Errors_Exceptions;

public class C02_OutOfMemory {
    public static void main(String[] args) {

        String str = "Merhaba Java";
        System.out.println(str);

        int sayac =0;

        while (sayac < 30){
           sayac++;
            try {
                str += str;                                   // hatanin kaynaklandigi kod parcasi
            }catch (OutOfMemoryError e) {                     // catch icinede yakalanmasini bekledigimiz hata türü belirtilir
                System.out.println("Bir hata olustu!!!");
                System.out.println("Hata : "+e.getMessage()); //hatanin kaynagini belirten hata mesajini yazdirir
                                                              // getMessage:Hata : Overflow: String length out of range
            }catch (Error e){
                e.printStackTrace();                          // hatanin takibini yapmak icin gerekli olan konsol ciktilarini yazdirir
            }

            System.out.println("Program sona erdi...");
        }
    }
}
