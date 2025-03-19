package day43_Inheritance.Employee;

public class Employee {

    String name;
    int employeeId;
    double salary;
    int workHours;
    int vacationDay;
    char gender;

    String campusName = "Yenisehir Kampüsü";

    public void raiseSalary(){
        System.out.println("%25 oraninda maas zammi talebi var.");
    }
    public void leaveHoliday(int day){
        System.out.println(this.name+"'in "+day+" gunluk izin talebi var.");
    }
    public void resign(){
        System.out.println("Isten affini istedi.");
    }

}
