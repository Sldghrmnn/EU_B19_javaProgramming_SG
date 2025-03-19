package day44_Inheritance02.VehicleProject;

public class Car extends Vehicle{

    String model = "Unkonwn";

    public Car(String brand,String model){
        this.model = model;
        this.brand = brand;
    }

    public void startEngineForCar(){
        System.out.println("Car says :");
        startEngine();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
