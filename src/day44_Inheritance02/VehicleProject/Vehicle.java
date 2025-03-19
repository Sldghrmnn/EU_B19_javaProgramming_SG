package day44_Inheritance02.VehicleProject;

public class Vehicle {

    String brand = "Generic Vehicle";

    public Vehicle(){System.out.println("Vehicle default constr.");}

    public void startEngine(){System.out.println("Engine is started...");}

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
