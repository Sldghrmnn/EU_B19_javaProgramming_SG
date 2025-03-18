package day43_Inheritance.Vehicle;

public class Car extends Vehicle {

    int treeSize;
    int numberOfDoors;

    public Car(){
        super();
        System.out.println("Car constructor");
    }

    public void honk(){
        System.out.println("Araba korna caliyor.");
    }
    public void openTrunk(){
        System.out.println("Bagaj acildi.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "treeSize=" + treeSize +
                ", numberOfDoors=" + numberOfDoors +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                ", seats=" + seats +
                ", light=" + light +
                '}';
    }
}
