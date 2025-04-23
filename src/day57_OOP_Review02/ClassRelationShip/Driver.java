package day57_OOP_Review02.ClassRelationShip;

public class Driver {

    private String name;
    private String licenceClass;

    public Driver(String name, String licenceClass) {
        this.name = name;
        this.licenceClass = licenceClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenceClass() {
        return licenceClass;
    }

    public void setLicenceClass(String licenceClass) {
        this.licenceClass = licenceClass;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenceClass='" + licenceClass + '\'' +
                '}';
    }
}
