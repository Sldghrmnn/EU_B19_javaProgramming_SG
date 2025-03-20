package day45_Review.ShapeProject;

public class Rectangle extends Shape{

    double length;
    double width;

    public Rectangle(String color,double lenght,double width){
        super(color);
        this.length=lenght;
        this.width=width;
        System.out.println("Inside Rectangle constructor with color "+this.color+ " length :"+ this.length+", width : "+ this.width);
    }

    public void draw(){
        System.out.println("Drawing rectangle");
    }

    public double calculateArea(){
        return this.length*this.width;
    }

    public void displayInfo(){
        System.out.println("Color :"+super.color+" Lenght :"+this.length+" Width :"+this.width);
    }

}
