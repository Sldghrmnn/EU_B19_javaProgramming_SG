package day46_AccessModifiers.Zoo;

public non-sealed class Bird extends Animal {

    public Bird(){}

    public Bird(String name,int age, String color){super(name,age,color);}

    public void move(){
        System.out.println("I'am a bird. And I can run with my two legs");
    }

    public void makeSound(){
        System.out.println("I am a bird.I make sound cik-cik");
    }

    public void fly(){
        System.out.println("I'am a bird.I can fly");
    }

    public String toString(){
        // return "I am a bird " + super.toString();
        String str = "I ama a bird:\n";
        str+= "My name is : "+getName(); //super.getName()
        str+= "My age is : "+getAge(); //super.getAge()
        str+= "My color is :"+getColor(); //super.getColor
        return str;
    }
}
