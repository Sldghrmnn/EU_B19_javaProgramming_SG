package day39_Encapsulation_01;

public class SimpleGetterAndSetter {


  // private-- sinirli erisim vardir. ayni class icinden ulasilabilir
  //Data members--> must be private
   private int number;

   //constructor
    public SimpleGetterAndSetter(){
       // this.number=0;
        setNumber(0);
    }

    public SimpleGetterAndSetter(int number){
        setNumber(number);
        /*
        if (number>0){
            this.number=number;
        }else{
            System.out.println("number degiskeni 0 dan kucuk olamaz");
            this.number=0;
        }

         */
    }
/*
    public void numberDegerAta(int number){

        if (number>0){
            this.number=number;
        }else{
            System.out.println("number degiskeni 0 dan kucuk olamaz");
            this.number=0;
        }
    }

 */

   // getter method--return tipi vardir
    public int getNumber() {
        return number;
    }

   // setter veya Mutator method--data set etmeye yarar
    public void setNumber(int number) {
        //this.number = number; // herhangi bir kontrol yapmadan doğrudan değişkene değer atar
        //Yukarıddaki gibi Doğrudan değer atamak yerine bazı kontroller sonrası değer atamak
        // için aşağıdaki kontrolleri yazdık

        //Değişkene doğrudan değer atamak yerine belirli bir kurala uygun olup olmadığına karar
        // verip değer atamasını bu karara göre yaptık

        if (number>0){
            this.number=number;
        }else{
            System.out.println("number degiskeni 0'dan kucuk olamaz");
            this.number=0;
        }
    }

    @Override
    public String toString() {
        return "SimpleGetterAndSetter{" +
                "number=" + number +
                '}';
    }

}
