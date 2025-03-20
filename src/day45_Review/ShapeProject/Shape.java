package day45_Review.ShapeProject;

public class Shape {

    String color;

    public Shape(String color){
        this.color = color;
        System.out.println("Inside Shape constructor with color : "+this.color);
    }

    public void draw(){System.out.println("Drawing a shape");}

    public double calculateArea(){
        System.out.println("Calculating Area of the shape");
        return 0;
    }
}
