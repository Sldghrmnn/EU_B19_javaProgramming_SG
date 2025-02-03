package day18_Review_BranchmentAndLabeledStatements;

public class C15_LabeledDoWhileLoop {
    public static void main(String[] args) {

      int i;
      outer:
      do {
          i = 8;
          inner:
          while (true){
              System.out.println("i = "+i--);
              if (i == 4){
                  break outer;
              }
          }
      }while (true);
        System.out.println(i);


    }
}
