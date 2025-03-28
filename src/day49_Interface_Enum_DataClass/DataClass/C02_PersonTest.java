package day49_Interface_Enum_DataClass.DataClass;

public class C02_PersonTest {
    public static void main(String[] args) {


        C01_Person person = new C01_Person("Ali","Akyaka","5432356","Bala/Ankara");
        System.out.println("person.getFirstName() = " + person.getFirstName());

        System.out.println(person);

        C03_PersonRecord personRecord = new C03_PersonRecord("Ayse","Guz","6547787","Cankaya/ANKARA");

        System.out.println("personRecord.firstName() = " + personRecord.firstName());
        System.out.println(personRecord);

        personRecord.printAddress();
        System.out.println("personRecord.address() = " + personRecord.address());

        System.out.println("personRecord.generateCode() = " + personRecord.generateCode());

    }
}
