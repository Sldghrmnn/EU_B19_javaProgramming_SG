package day56_OOP_Review01.Fabrika;

public class FirmApplication {
    public static void main(String[] args) {

        Firm firm = new Firm("ABC Muhendislik","Sanayi cad. no:123");

        Person worker1 = new Worker("Ahmet Worker",35,"Production");
        Person worker2 = new Worker("Mehmet Worker",46,"Sales");
        Person worker3 = new Worker("Hatice Worker",28,"HR");

        Person teacher= new Teacher("Ali Teacher",35);

        Person engineer1 = new Engineer("Suleyman Engineer",41,"ITU");
        Person engineer2 = new Engineer("Selda Engineer",25,"METU");
        Person engineer3 = new Engineer("Tulay Engineer",21,"Hacettepe");

        Person driver = new Driver("Bilal Driver",34,"B Class");

        Person volunteer = new Volunteer("Mustafa Volunteer",18);

        firm.addWorker(worker1,worker2,worker3);
        firm.addWorker(teacher,engineer1,engineer2,engineer3);
        firm.addWorker(driver,volunteer);

        System.out.println("Name of Firm      = " + firm.getName());
        System.out.println("Adress of Firm    = " + firm.getAdress());

        System.out.println("------------------------------------------------");

        for (Person person : firm.getFirmWorkers() ) {
            System.out.println(person.showInfo());
        }

         System.out.println();

         System.out.println("Mounthly pay for all payables");
         System.out.println("------------------------------");

         for (Person person : firm.getFirmWorkers()) {
                if (person instanceof Payable payable){
                    System.out.println(payable.getClass().getSimpleName());
                    System.out.println( ((Person)payable).getName());
                    payable.pay(1500);
                }
         }

        System.out.println();
        System.out.println("Person who can drive");
        System.out.println("--------------------------");

        for (Person person :firm.getFirmWorkers() ) {
        	if (person instanceof CanDrive canDrive){
                System.out.println(((Person)canDrive).getName());
                canDrive.drive();
            }
        }






    }
}
