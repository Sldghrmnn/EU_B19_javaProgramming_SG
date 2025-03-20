package day45_Review.ShapeProject;

public class Circle extends Shape {

    double redius;

    public Circle(String color,double redius){
        super(color);
        this.redius=redius;
        System.out.println("Inside Circle constructor with color "+this.color+" and redius "+this.redius);
    }

    public void draw(){System.out.println("Drawing cirle");}

    @Override
    public double calculateArea() {return Math.PI*this.redius*this.redius;}

    public void displayInfo(){
        System.out.println("Color :"+super.color+" Radius :"+this.redius);
    }
}
