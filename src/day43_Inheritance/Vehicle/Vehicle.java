package day43_Inheritance.Vehicle;

public class Vehicle {

    String brand;
    String model;
    int year;
    double weight;
    int seats;
    boolean light;

    public Vehicle(){
        System.out.println("Vehicle constructor");
    }
    public void start(){
        System.out.println("Arac calisti");
    }
    public void stop(){
        System.out.println("Arac durdu");
    }
    public void move(){
        System.out.println("Arac hareket ediyor");
    }
    public boolean turnLigthOn(boolean dayTime){
        if (!dayTime){
            light = true;
            return light;
        }else{
            return light;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                ", seats=" + seats +
                ", light=" + light +
                '}';
    }
}
