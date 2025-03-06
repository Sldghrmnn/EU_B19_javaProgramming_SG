package day37_Constructor_PassingObjects01;

public class Circle {

    //Attribute/ Properties-Fields-Data member-State
    double radius; //instance veriable--object e ait
    double height;

    /*
    Constructor' methodunun temell amacaci classlarin olusturulacak objelerin
    data field,attributte varible
    alanlarina baslangic degerlerini atamaktir

    Ismi class ismi ile ayni olmak zorundadir,return type yoktur void dahil
     */

    public Circle(){
        System.out.println("No args/Default constructor called");
        radius = 0;
        height = 0;
    }

    public Circle(double yaricap){
        System.out.println("Parameterized Constructor called");
        radius = yaricap;
    }


    public Circle(double yaricap,double yukseklik){
        System.out.println("Parameterized Constructor called");
        radius = yaricap;
        height = yukseklik;
    }

    public double getArea(){
       // return radius*radius*Math.PI;
        return Math.pow(radius,2)*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }

    public double getRadius(){
       return radius;
    }

    public void setHeight(double yukseklik){
        height = yukseklik;
    }
    public double getHeight(){
        return height;
    }

    public double getVolume(){
      //  return 2*radius*Math.PI*height;
        return getPerimeter()*height;
    }

    public String showInfo(){
        String str = "";
        str += "Dairenin yaricapi   : "+radius+" \n";
        str += "Dairenin yuksekligi : "+height+" \n";
        str += "------------------------------------\n";
        str += "Dairenin alani      : "+getArea()+" \n";
        str += "Dairenin cevresi    : "+getPerimeter()+" \n";
        str += "Dairenin hacmi      : "+getVolume()+" \n";

        return str;
    }





    public static void main(String[] args) {

        Circle daire1 = new Circle(); //default constructor- No args/params const.
        System.out.println("daire1.radius = " + daire1.radius);

        daire1.radius = 12;
        daire1.height = 3;
        System.out.println("daire1.radius = " + daire1.radius);


        Circle daire2 = new Circle(15);
        System.out.println("daire2.radius = " + daire2.radius);


        System.out.println("daire1.getArea() = " + daire1.getArea());
        System.out.println("daire2.getArea() = " + daire2.getArea());
        System.out.println("daire1.GetPerimeter() = " + daire1.getPerimeter());

        daire1.radius = 125;
        System.out.println("daire1.GetPerimeter() = " + daire1.getPerimeter());

        daire2.radius = 100;
        System.out.println("daire2.radius = " + daire2.radius);
        System.out.println("daire2.GetPerimeter() = " + daire2.getPerimeter());
        System.out.println("daire2.getArea() = " + daire2.getArea());


        daire2.setRadius(25);
        System.out.println("daire2.radius = " + daire2.radius);
        System.out.println("daire2.getArea() = " + daire2.getArea());
        System.out.println("daire2.getRadius() = " + daire2.getRadius());

        System.out.println();


        Circle daire3 = new Circle(2,3);
        System.out.println("daire3.getRadius() = " + daire3.getRadius());
        System.out.println("daire3.getHeight() = " + daire3.getHeight());
        System.out.println("daire3.getArea() = " + daire3.getArea());
        System.out.println("daire3.GetPerimeter() = " + daire3.getPerimeter());
        System.out.println("daire3.getVolume() = " + daire3.getVolume());
        System.out.println();

        System.out.println("daire3.showInfo() = " + daire3.showInfo());
        System.out.println("daire1.showInfo() = " + daire1.showInfo());
        System.out.println("daire2.showInfo() = " + daire2.showInfo());

    }




}
