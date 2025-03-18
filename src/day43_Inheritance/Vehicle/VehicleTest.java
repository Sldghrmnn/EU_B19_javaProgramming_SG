package day43_Inheritance.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.brand = "Aracin markasi";
        vehicle.model = "Aracin modeli";
        vehicle.start();


        Car vehicleCar = new Car();
        vehicleCar.brand = "Toyota";
        vehicleCar.model = "Avensis";
        vehicleCar.seats = 5;
        vehicleCar.light = vehicleCar.turnLigthOn(false);
      //  System.out.println("vehicleCar.light = " + vehicleCar.light);

        vehicleCar.weight = 1500;
        vehicleCar.year =  2012;
        vehicleCar.treeSize = 1400;
        vehicleCar.numberOfDoors = 4;

        System.out.println("vehicleCar = " + vehicleCar);

        System.out.println("vehicle = " + vehicle);

        Plane vehiclePlane = new Plane();

        vehiclePlane.brand = "Boeing";
        vehiclePlane.model = "737";
        vehiclePlane.seats = 100;
        vehiclePlane.light = vehiclePlane.turnLigthOn(true);
        vehiclePlane.weight = 15000;
        vehiclePlane.year =  2021;
        vehiclePlane.engineType = "Jet";
        vehiclePlane.propellerSize = 108;

        System.out.println(vehiclePlane);

        System.out.println("----------------------------------");


    }
}
