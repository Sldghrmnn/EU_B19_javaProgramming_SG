package day50_Polimorphism02.Example;

public class Test {
    public static void main(String[] args) {

        Driver driver = new Driver();
        driver.method1();
        driver.method2();
        driver.method3();
        driver.method4();
        driver.method5();

        ChromeDriver chromeDriver= new ChromeDriver();
        chromeDriver.method1();
        chromeDriver.method2();
        chromeDriver.method3();
        chromeDriver.method4();
        chromeDriver.method5();

        System.out.println("---------------------");

        SafariDriver safariDriver = new SafariDriver();
        safariDriver.method1();
        safariDriver.method2();
        safariDriver.method3();
        safariDriver.method4();
        safariDriver.method5();

        System.out.println("---------------------");

        Driver driver1 = new ChromeDriver();
        driver1.method1();
        driver1.method2();
        driver1.method3();
        driver1.method4();
        driver1.method5();
        ((ChromeDriver)driver1).method6();

    }
}
