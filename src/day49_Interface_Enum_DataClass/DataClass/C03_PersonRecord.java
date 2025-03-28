package day49_Interface_Enum_DataClass.DataClass;

public record C03_PersonRecord(String firstName,String lastName,String phoneNumber,String address) implements Addressable{


    @Override
    public void printAddress() {
        System.out.println("address() = " + address());
        System.out.println("address = " + address);
    }
    public String generateCode() {
        return firstName.toUpperCase().substring(0, 1) + lastName.substring(0, 2) + phoneNumber.substring(0, 2) + address.length();

    }
}
