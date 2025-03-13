package day41_Review.encapsulation;

public class C02_EmployeeTest {
    public static void main(String[] args) {
        C01_Employee employee = new C01_Employee();

        employee.setFirstName("Sezen");

        employee.setLastName("Ay");

        employee.setAge(35);

        employee.setPhoneNumber("5325455653");

        System.out.println("employee = " + employee);

        C01_Employee employee1 = new C01_Employee("123","14",-9,"telefon");
        System.out.println("employee1 = " + employee1);

        C01_Employee employee2 = new C01_Employee("Hasan","Uzun",49,"2125507044");
        System.out.println("employee2 = " + employee2);





    }


}
