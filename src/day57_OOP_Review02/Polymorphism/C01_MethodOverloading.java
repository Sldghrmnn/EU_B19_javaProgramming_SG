package day57_OOP_Review02.Polymorphism;

public class C01_MethodOverloading {
    public static void main(String[] args) {

        System.out.println("sum(6,2) = " + sum(6, 2));

        byte a=25;
        byte b=25;
        System.out.println("sum(a,b) = " + sum(a, b));

        int i = 5;
        double d = i;
        int k=(int) d;

        System.out.println("sum(8.0,32.0) = " + sum(8.0, 32.0));

        System.out.println("sum(25.0f,36f) = " + sum(25.0f, 36f));

        System.out.println("sum(25,25.0) = " + sum(25, 25.0));

        System.out.println("sum(2,5,7) = " + sum(2, 5, 7));


        System.out.println("sum(2,(int)5.2,(int)2.5,(int)5.8) = " + sum(2, (int) 5.2, (int) 2.5, (int) 6.8));


    }

    public static int sum(int x,int y){
        System.out.println("int");
        return x+y;
    }
    public static double sum(double x,double y){
        System.out.println("double");
        return x+y;
    }
    public static float sum(float x,float y){
        System.out.println("float");
        return x+y;
    }
    public static int sum(byte x,byte y){
        return x+y;
    }

    public static double sum(double x,double y,double z){
        System.out.println("1");
        return x+y+z;
    }
    public static double sum(double x,double y,int z){
        System.out.println("2");
        return x+y+z;
    }
    public static double sum(double x,int y,int z){
        System.out.println("3");
        return x+y+z;
    }
    public static double sum(double x,int y,int z,int v){
        System.out.println("4");
        return x+y+z+v;
    }
}
