package day45_Review.BankAccountProject;

public class Akbank extends Bank{

    public Akbank(double intialBalance){
        super(intialBalance);
       // this.balance =intialBalance;
    }

    public double getInterestRate(){return 7.0;}
}
