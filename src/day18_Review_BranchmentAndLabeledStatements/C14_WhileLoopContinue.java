package day18_Review_BranchmentAndLabeledStatements;

public class C14_WhileLoopContinue {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (i % 3 == 0)continue;
            sum += i;
        }
        System.out.println("sum = " + sum);

        int sum1 = 0;
        int j = 0;

        while (j < 4){
            if (j % 3 ==0){
                j++;
                continue;
            }
            sum1 += j;
            j++;
        }
        System.out.println("sum1 = " + sum1);


    }
}
