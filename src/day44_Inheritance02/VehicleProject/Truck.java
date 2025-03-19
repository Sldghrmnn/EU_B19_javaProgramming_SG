package day44_Inheritance02.VehicleProject;

public class Truck extends Vehicle{

    String damper = "4 damperli";

    public Truck(String brand,String damper){this.damper=damper;}

    @Override
    public String toString() {
        return "Truck{" +
                "damper='" + damper + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
