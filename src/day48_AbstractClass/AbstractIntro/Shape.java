package day48_AbstractClass.AbstractIntro;

public abstract class Shape {

    protected  static final double PI = 3.14;
    private String name;

    public Shape(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int perimeter();

    public abstract int area();

    protected static void showInfo(){
        System.out.println("Abstract Class : "+PI);
    }

    protected final void finalMethod(){
        System.out.println("Abstract class final Method");
    }
}
