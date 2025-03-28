package day49_Interface_Enum_DataClass.Shape;

public class Circle extends ShapeAbstract implements Shape{

    private double radius;

    public Circle(String name, String color,double radius) {
        super(name, color);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
            this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2*PI*radius;
    }

    @Override
    public double area() {
        return  PI* Math.pow(radius,2);
            //    PI*(radius*radius);
    }

}
