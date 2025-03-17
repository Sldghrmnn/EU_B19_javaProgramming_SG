package day42_staticMemebers;

public class C03_CountTest {
    public static void main(String[] args) {

        C02_Count count1 = new C02_Count();
        C02_Count count2 = new C02_Count();
        C02_Count count3 = new C02_Count();

        System.out.println("count1.getInstanceCounter() = " + count1.getInstanceCounter());
        System.out.println("count2.getInstanceCounter() = " + count2.getInstanceCounter());
        System.out.println("count3.getInstanceCounter() = " + count3.getInstanceCounter());

        System.out.println("C02_Count.instanceCounter = " + C02_Count.instanceCounter);

    }
}
