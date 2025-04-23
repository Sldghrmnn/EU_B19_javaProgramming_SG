package day57_OOP_Review02.ClassRelationShip;

public class Test {
    public static void main(String[] args) {

        Engine engine1 = new Engine("Electric");
        Driver carDriver= new Driver("Ahmet Surucu","B");


        Car myCar = new Car();
        System.out.println("myCar.getEngine() = " + myCar.getEngine());
      //  myCar = null;
       // System.out.println("myCar.getEngine() = " + myCar.getEngine());// hata verdi. cunku composition

        Car mynewCar = new Car(engine1);
        System.out.println("mynewCar.getEngine() = " + mynewCar.getEngine());
        mynewCar= null;
        System.out.println("engine1.getType() = " + engine1.getType());

        Car myThirdCar = new Car(carDriver);
        Car myFourthCar = new Car(carDriver);

        System.out.println("myThirdCar.getDriver() = " + myThirdCar.getDriver());
        myThirdCar=null;
        System.out.println("carDriver.getName() = " + carDriver.getName());
    }
}
