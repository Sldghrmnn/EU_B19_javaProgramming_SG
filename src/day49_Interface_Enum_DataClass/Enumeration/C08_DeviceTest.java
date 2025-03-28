package day49_Interface_Enum_DataClass.Enumeration;

public class C08_DeviceTest {
    public static void main(String[] args) {

        C07_Device cihaz1 = C07_Device.Redmi_8;
        System.out.println("cihaz1.getUdid() = " + cihaz1.getUdid());
        System.out.println("cihaz1.getPlatformName() = " + cihaz1.getPlatformName());

        C07_Device cihaz2 = C07_Device.NokiaLumia;
        System.out.println("cihaz2.getUdid() = " + cihaz2.getUdid());
    }
}
