package day46_AccessModifiers.Zoo;

public non-sealed class Dog extends Animal{

    public Dog(String name, int age, String color) {super(name, age, color);}

    @Override
    public void move() {
        System.out.println("I'am a dog. I can run");
    }

    @Override
    public void makeSound() {
        System.out.println("I'am a dog. I make sound hav-hav");
    }

    @Override
    public String toString() {
        //return "I am a Dog " + super.toString();
        // return "I am a bird " + super.toString();
        String str = "I ama a dog:\n";
        str+= "My name is : "+getName();//super.getName()
        str+= "My age is : "+getAge(); //super.getAge()
        str+= "My color is :"+getColor(); //super.getColor
        return str;
    }
}
