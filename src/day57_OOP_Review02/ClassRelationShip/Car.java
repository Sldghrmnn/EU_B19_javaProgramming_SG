package day57_OOP_Review02.ClassRelationShip;

public class Car {

    private String brand;
    private String model;
    private Engine engine;
    private Driver driver;

    public Car() {
        this.engine=new Engine("Diesel V6");
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Car(Driver driver) {
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }
}
