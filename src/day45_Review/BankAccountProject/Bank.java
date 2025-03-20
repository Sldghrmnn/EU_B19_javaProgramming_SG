package day45_Review.BankAccountProject;

public class Bank {

    public double balance;


    public Bank(double balance){this.balance = balance;}

    public double getInterestRate(){return 0;}

    public double calculateInterest(){
        double interestRate=  getInterestRate();
        double interest = balance*(interestRate/100);
        this.balance += interest;
        return this.balance;
    }
}
