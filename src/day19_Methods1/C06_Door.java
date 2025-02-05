package day19_Methods1;

public class C06_Door {
    public static void main(String[] args) {

        System.out.println("Start !!");
        openDoor();
        enterInside();
        closeDoor();
        System.out.println("Finish !!");

        System.out.println("Start !!");
        openDoor();
        closeDoor();
        System.out.println("Finish !!");

    }
    public static void openDoor(){
        System.out.println("I open the door.");
    }

    public static void enterInside(){
        System.out.println("I enter inside home");
    }

    public static void closeDoor(){
        System.out.println("I close the door.");
    }
}
