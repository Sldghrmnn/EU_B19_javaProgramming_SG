package day31_Arrays02;

public class C05_ArrayParametre {
    public static void main(String[] args) {
        String [] cars = {"Toyota","Opel","Mercedes","BMW","Audi"};
        printArray(cars);
        printArray(cars);
    }

    public static void printArray(String[] arr){
        for (String eleman :arr ) {
            System.out.println(eleman);
        }
    }

    public static void printArray(Object[] cars){  // method overloading-ayni class ayni isim ve farkli parameter
        for (Object car :cars ) {
            System.out.println(car);
        }
    }
}
