package day48_AbstractClass.Vehicle;

public class OtoparkTest {
    public static void main(String[] args) {
        OtoPark otoPark = new OtoPark("Katli otopark","Kurtulus,ANKARA");

        Sedan sedan = new Sedan("Mercedes","e200",2021,"Gray");
        Sedan sedan1 = new Sedan("Mercedes","e220",2024,"White");
        Sedan sedan2 = new Sedan("Mercedes","e300",2025,"Silver");

        Bus bus  = new Bus("Mercedes","Maraton",2021,"Black");
        Bus bus1 = new Bus("Mercedes","Maraton",2021,"Black");
        Bus bus2 = new Bus("Mercedes","Maraton",2021,"Black");
        Bus bus3 = new Bus("Mercedes","Maraton",2021,"Black");
        Bus bus4 = new Bus("Mercedes","Maraton",2021,"Black");


        otoPark.addVehicle(sedan);
        otoPark.addVehicle(sedan1);
        otoPark.addVehicle(sedan2);
        otoPark.addVehicle(bus);
        otoPark.addVehicle(bus1);
        otoPark.addVehicle(bus2);
        otoPark.addVehicle(bus3);
        otoPark.addVehicle(bus4);

        otoPark.listOfVehicle();
        System.out.println();
        otoPark.numberOfVehiclesByType();
    }
}
