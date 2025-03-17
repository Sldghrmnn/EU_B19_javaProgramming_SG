package day42_staticMemebers;

public class C07_DinnerTest {
    public static void main(String[] args) {

        C06_Dinner baba = new C06_Dinner();
        C06_Dinner anne = new C06_Dinner();
        C06_Dinner cocuk = new C06_Dinner();

        baba.dilimAl();
        anne.dilimAl();
        anne.dilimAl();
        cocuk.dilimAl(3);

        System.out.println("baba.pizzaDilimi = " + baba.pizzaDilimi);
        System.out.println("anne.pizzaDilimi = " + anne.pizzaDilimi);
        System.out.println("cocuk.pizzaDilimi = " + cocuk.pizzaDilimi);

        baba.dilimAl(3);

        System.out.println("baba.pizzaDilimi = " + baba.pizzaDilimi);
        System.out.println("anne.pizzaDilimi = " + anne.pizzaDilimi);
        System.out.println("cocuk.pizzaDilimi = " + cocuk.pizzaDilimi);

    }
}
