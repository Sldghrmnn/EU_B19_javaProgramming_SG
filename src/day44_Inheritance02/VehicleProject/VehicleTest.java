package day44_Inheritance02.VehicleProject;

public class VehicleTest {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota","Corolla");
        System.out.println("myCar.toString() = " + myCar.toString());
        myCar.startEngineForCar();

        System.out.println();

        Truck myTruck = new Truck("abc","8 damperli");
        System.out.println("myTruck.toString() = " + myTruck.toString());
    }
}
