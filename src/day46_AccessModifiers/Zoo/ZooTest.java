package day46_AccessModifiers.Zoo;

public class ZooTest {
    public static void main(String[] args) {

        Zoo zoo=new Zoo("AOÇ Hayvanat Bahçesi", "Çamlıca Mahallesi");

        Dog dog=new Dog("Karabaş",3,"Beyaz");
        Dog dog1=new Dog("Karabaş",3,"Beyaz");
        Dog dog2=new Dog("Karabaş",3,"Beyaz");

        Bird bird=new Bird("Cicikuş",2,"Sarı");
        Bird bird1=new Bird("Cicikuş",2,"Sarı");
        Bird bird2=new Bird("Cicikuş",2,"Sarı");

        zoo.addAnimal(dog);
        zoo.addAnimal(dog1,dog2,bird,bird1,bird2);

        System.out.println(zoo);

    }
}
