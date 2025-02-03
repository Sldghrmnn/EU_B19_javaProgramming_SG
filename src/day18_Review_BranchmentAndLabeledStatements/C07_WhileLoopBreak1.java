package day18_Review_BranchmentAndLabeledStatements;

public class C07_WhileLoopBreak1 {
    public static void main(String[] args) {
        int sum =0;
        int number =0;
        while (number < 20){
            number++;
            System.out.println("number = " + number);
            sum += number;

            if (sum >=100){
                break;
            }
            System.out.println("Dongu ici");

        }
        System.out.println("Number : " + number);
        System.out.println("sum = " + sum);

    }
}
