package day48_AbstractClass.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {


        Bus bus = new Bus("Mercedes","Maraton",2021,"Black");
        bus.stop();
        bus.start();
        bus.drive();

        System.out.println(bus);

        Sedan sedan = new Sedan("Honda","Accord",2021,"White");
        sedan.start();
        sedan.stop();
        sedan.drive();

    }
}
