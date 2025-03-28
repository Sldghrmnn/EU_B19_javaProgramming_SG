package day49_Interface_Enum_DataClass.Enumeration;

public class C04_Araba {

    private C01_Colors color;
    private C03_Brands brand;
    private int year;

    public C04_Araba(C01_Colors color, C03_Brands brand, int year) {
        this.color = color;
        this.brand = brand;
        this.year = year;
    }

    public C01_Colors getColor() {
        return color;
    }

    public void setColor(C01_Colors color) {
        this.color = color;
    }

    public C03_Brands getBrand() {
        return brand;
    }

    public void setBrand(C03_Brands brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "C04_Araba{" +
                "color=" + color +
                ", brand=" + brand +
                ", year=" + year +
                '}';
    }
}
