package day45_Review.ShapeProject;

public class ShapeTest {
    public static void main(String[] args) {

         Circle circle = new Circle("blue",3.5);
         Rectangle rectangle = new Rectangle("black",5,4);

         circle.displayInfo();
         circle.draw();
         System.out.println(circle.calculateArea());
         System.out.println("----------------------------");

         rectangle.displayInfo();
         rectangle.draw();
         System.out.println(rectangle.calculateArea());

    }
}
