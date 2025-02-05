package day18_Review_BranchmentAndLabeledStatements;

public class C17_ReturnExample {
    public static void main(String[] args) {

        for (int i = 0; i < 100 ; i++) {
            if (i == 20){
                return;
            }
            System.out.println(i);
        }
        System.out.println("dddddd"); // return da methodu bitirdigi icin,
        // bu sirayi artik main methodunda kullanmaz(gormez)




    }
}
