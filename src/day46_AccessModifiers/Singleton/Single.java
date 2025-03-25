package day46_AccessModifiers.Singleton;

public class Single {

    private static Single singleInstance = null; //Metod ile oluşturulan instance ı tutan değişken
    private static int maxNumberOfInstance; //Oluşturulabilecek maksimum instance sayısı
    private static int numberOfInstance; // Oluşturulan instance sayısı



    private Single() {numberOfInstance++;}//Oluşturulan instance sayısı

    //Constructor lar private tanımlandığından ancak bu metod ile instance oluşturulabilir.

    public static Single getInstance(){
        System.out.println("GetInstance Method Called");
        if (singleInstance == null || numberOfInstance < maxNumberOfInstance){
            System.out.println("Instance Created");
            singleInstance = new Single();
        }
      return singleInstance;
    }

    public static void setMaxInstance(int instance){maxNumberOfInstance= instance;}

    public int getMaxNumberOfInstance(){return numberOfInstance;}
}
