package day46_AccessModifiers.PackageA;

public class AccessModifiers {

    private  String privateStr; //Within same class all members can access--> special to class
    String defaultStr;  //Default-- Within same package all class can access.
    protected String protectedStr;  //Same package and other class which has inheritance relationship
    public String publicStr;    // All classes can access. No restrictions.



    private void privateMetod(){
        privateStr="Private";
        defaultStr="Default";
        protectedStr="Protected";
        publicStr="Public";
        System.out.println("Private Method called");
    }

    void defaultMethod(){
        privateStr="Private";
        defaultStr="Default";
        protectedStr="Protected";
        publicStr="Public";
        privateMetod();
        System.out.println("Default Method called");

    }
    protected void protectedMethod(){
        privateStr="Private";
        defaultStr="Default";
        protectedStr="Protected";
        publicStr="Public";
        System.out.println("Protected Method called");

    }
    public void publicMethod(){
        privateStr="Private";
        defaultStr="Default";
        protectedStr="Protected";
        publicStr="Public";
        System.out.println("Public Method called");

    }
}
