package day43_Inheritance.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Ahmet";
        employee1.employeeId = 1001;


        //  employee1.joinCourt(); parent class child classın field ve methodlarına erişemez.
        //  kardeş classlar arasında erişim yoktur.

        System.out.println("employee1.name = " + employee1.name);

        Developer developer1 = new Developer();
        developer1.name = "Pınar";
        developer1.employeeId = 1002;
        developer1.releaseCode();

        System.out.println("developer1.name = " + developer1.name);

        Lawyer lawyer1 = new Lawyer();
        lawyer1.name = "Orhan";
        lawyer1.employeeId = 5001;
        lawyer1.leaveHoliday(10);
        lawyer1.joinCourt();

        System.out.println("lawyer1.name = " + lawyer1.name);

        Secretary secretary1 = new Secretary();
        secretary1.name = "Şevket";
        secretary1.employeeId = 102;

        secretary1.leaveHoliday(3);

        System.out.println("secretary1.name = " + secretary1.name);

        employee1.raiseSalary();
        developer1.raiseSalary();
        secretary1.raiseSalary();
        lawyer1.raiseSalary();

        System.out.println("developer1.campusName = " + developer1.campusName);
        System.out.println("lawyer1.campusName = " + lawyer1.campusName);
    }
}
