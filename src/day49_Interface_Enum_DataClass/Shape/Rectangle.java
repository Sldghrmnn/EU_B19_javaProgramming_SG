package day49_Interface_Enum_DataClass.Shape;

public class Rectangle extends ShapeAbstract implements Shape{

    private double lenght;
    private double width;

    public Rectangle(String name,String color,double lenght, double width) {
        super(name,color);
        this.lenght = lenght;
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {return width;}

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 2* (lenght+width);
    }

    @Override
    public double area() {
        return lenght*width;
    }


    public void threeDPrinter(){
        System.out.println("Bende kullanılmıyor");
    }

//    public void displayInfo(){
//      //  Shape.super.displayInfo();
//        System.out.println("I am a rectangle");
//
//    }
}
