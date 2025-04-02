package day49_Polimorphism01.RunTime;

public class Duck extends Animal{


    public Duck(String name) {super(name);}

    @Override
    void makeSound() {
        System.out.println("Iam a Duck and I meke sound like 'vak,vak'");}


    public void printName(){
        System.out.println("Duck class printName methodu");
        System.out.println(getName().toUpperCase());}

    public void fly(){
        System.out.println("I am a duck and I fly ");}
}
