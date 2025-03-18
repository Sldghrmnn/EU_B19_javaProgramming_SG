package day43_Inheritance.Vehicle;

public class Plane extends Vehicle{

    int propellerSize;
    String engineType;

    public Plane(){
        super();
        System.out.println("plane constructor");
    }

    public int checkPressure(int feet){
        System.out.println("Basinc kontrol ediliyor.");
        if (feet > 10000){
            return 25;
        }else{
            return -5;
        }
    }

    public void taxi(){
        System.out.println("Ucak taksi yapiyor.");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "propellerSize=" + propellerSize +
                ", engineType='" + engineType + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                ", seats=" + seats +
                ", light=" + light +
                '}';
    }
}
