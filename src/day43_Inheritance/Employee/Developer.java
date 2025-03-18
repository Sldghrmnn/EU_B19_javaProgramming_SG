package day43_Inheritance.Employee;

public class Developer extends Employee {

    String projectName;

    String mainLang;

    String campusName = "Etlik Kampusu";

    public void releaseCode(){
        System.out.println("Kod canliya sunuldu");
    }

    public void assignVM(){
        System.out.println("VM olarak gorevlendirildi");
    }

}
