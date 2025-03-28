package day49_Interface_Enum_DataClass.DataClass;

public class C01_Person implements Addressable{

    private final String firstName;
    private final String lastName;
    private final String phone;
    private final String address;

    public C01_Person(String firstName, String lastName, String phone,String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address= address;

    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {return address;}

    @Override
    public String toString() {
        return "C01_Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void printAddress() {
        System.out.println(address);
        System.out.println(getAddress());
    }
}
