package day46_AccessModifiers.Zoo;

import java.util.ArrayList;

public class Zoo {

    private String name;
    private String adress;

    private ArrayList<Animal> animals;

    public Zoo(String name,String adress){
        this.name = name;
        this.adress = adress;
        this.animals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void addAnimal(Animal... animals){
        for (Animal animal1 : animals  ) {
            this.animals.add(animal1);
        }
    }


    public String toString(){
        String str="";
        for (Animal animal: getAnimals()  ) {
            str+=animal.toString()+"\n";
        }
        return str;
    }
}
