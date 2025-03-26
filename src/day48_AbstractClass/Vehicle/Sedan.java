package day48_AbstractClass.Vehicle;

public class Sedan extends Vehicle{


    public Sedan(String brand, String model, int year, String color) {
        super(brand, model, year, color);
    }

    @Override
    public void start() {
        System.out.println(getBrand()+" is stared");
    }

    @Override
    public void stop() {
        System.out.println(getBrand()+" is stoped");
    }

    @Override
    public void drive() {
        System.out.println(getBrand()+" is driving");
    }

    @Override
    public void turnLeft(int angle) {}

    @Override
    public void turnRight(int angle) {}
}
