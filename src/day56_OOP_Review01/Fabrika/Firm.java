package day56_OOP_Review01.Fabrika;

import java.util.ArrayList;

public class Firm {

    private String name;
    private String adress;

    private final ArrayList<Person> firmWorkers;

    public Firm(String name, String adress) {
        this.name = name;
        this.adress = adress;
        firmWorkers = new ArrayList<>();
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getAdress() {return adress;}

    public void setAdress(String adress) {this.adress = adress;}

    public ArrayList<Person> getFirmWorkers() {return firmWorkers;}

    public void addWorker(Person person){this.firmWorkers.add(person);}

    public void addWorker(Person... persons){
        for (Person person : persons) {
            addWorker(person);
        }
    }

    @Override
    public String toString() {
        return "Firma{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
