package day49_Interface_Enum_DataClass.Enumeration;

public enum C07_Device {

    Redmi_8("3kl35lk","12","Xiaomi8","Android"),
    NokiaLumia("252525","14","Nokia_Lum","Windows");

    private String udid;
    private String versiyon;
    private String deviceName;
    private String platformName;

    C07_Device(String udid,String versiyon,String deviceName,String platformName){
        this.udid=udid;
        this.versiyon=versiyon;
        this.deviceName=deviceName;
        this.platformName=platformName;
    }

    public String getUdid() {return udid;}

    public String getVersiyon() {
        return versiyon;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getPlatformName() {
        return platformName;
    }
}
