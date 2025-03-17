package day42_staticMemebers;

public class C01_Person {

    static String bossName = "John Doe";

    String name;


    public static void main(String[] args) {
        C01_Person person1 = new C01_Person();
        person1.name = "Ali";

        C01_Person person2 = new C01_Person();
        person2.name = "Elif";

        System.out.println("person1.name = " + person1.name); //Ali
        System.out.println("person2.name = " + person2.name);//Elif
        System.out.println("person1.bossName = " + person1.bossName); //John Doe
        System.out.println("person2.bossName = " + person2.bossName); //John Doe

        C01_Person.bossName = "Jessica Doe";

        System.out.println("person1.name = " + person1.name); //Ali
        System.out.println("person2.name = " + person2.name);//Elif
        System.out.println("person1.bossName = " + person1.bossName); //Jessica Doe
        System.out.println("person2.bossName = " + person2.bossName); //Jessica Doe

        person1.bossName = "Hasan Doe";
        person1.name = "Veli";

        System.out.println("person1.bossName = " + person1.bossName); //Hasan Doe
        System.out.println("person2.bossName = " + person2.bossName); //Hasan Doe
        System.out.println("person1.name = " + person1.name); //Veli
        System.out.println("person2.name = " + person2.name);//Elif

        C01_Person person3 = new C01_Person();
        C01_Person person4 = new C01_Person();
        C01_Person person5 = new C01_Person();

        System.out.println("person5.bossName = " + person5.bossName); //Hasan Doe

    }


}
