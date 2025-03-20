package day45_Review.A;

public class ATest {
    public static void main(String[] args) {

        A a = new A(12,"Ali");

        A a1 = new A(15,"Veli");
        a1.boy=180;
        a1.age=45;
        System.out.println(a.age);
        System.out.println(a.boy);
    }
}
