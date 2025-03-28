package day49_Interface_Enum_DataClass.Shape;

public abstract class ShapeAbstract {

    private String name;
    private String color;

    public ShapeAbstract(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}