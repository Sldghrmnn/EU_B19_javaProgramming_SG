package day15_ForLoops;

public class C08_DinamikLoop {
    public static void main(String[] args) {

      int max = 5050;
      int toplam = 0;

      int i;

      for (i = 0; toplam < max; i++){
          toplam += i;
      }
        System.out.println("i = " + ( i - 1));
        System.out.println("toplam = " + toplam);


    }
}
