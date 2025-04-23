package day57_OOP_Review02.ClassRelationShip;

public class Engine {

    private String type;

    public Engine(String type) {
        this.type= type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                '}';
    }
}
