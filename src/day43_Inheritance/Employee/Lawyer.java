package day43_Inheritance.Employee;

public class Lawyer extends Employee {

    String caseName;

    String caseStatus;

    public void joinCourt(){
        System.out.println("Avukat durusmaya katildi");
    }

    public void submitClaim(){
        System.out.println("Avukat davayi kazandi");
    }

    public void raiseSalary(){
        System.out.println("%55 oraninda maas zammi talep var.");
    }

}
