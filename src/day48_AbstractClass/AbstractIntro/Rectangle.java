package day48_AbstractClass.AbstractIntro;

public class Rectangle extends Shape {

    private int width;
    private int lenght;

    public Rectangle(String name){
        super(name);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public int perimeter() {
        return (lenght+width)*2;
    }

    @Override
    public int area() {
        return lenght*width;
    }
}
