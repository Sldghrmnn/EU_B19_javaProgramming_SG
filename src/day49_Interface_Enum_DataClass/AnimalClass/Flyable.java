package day49_Interface_Enum_DataClass.AnimalClass;

public interface Flyable {


    public static final int numberOfWings = 2;
    public void fly();

    public static void staticMethod(){
        System.out.println("Flyable static Method");
    }
    private static void staticMethodPrivate(){
        System.out.println("Flyable  private static Method");
    }


    private void menzil(){
        System.out.println("menzil - 1");
        System.out.println("menzil - 2");
        System.out.println("menzil - 3");
        System.out.println("menzil - 4");
        System.out.println("menzil - 5");
    }

    default void maxMenzil(){
        menzil();
        System.out.println("menzil max.");
    }
    default void minMenzil(){
        menzil();
        System.out.println("Menzil min");
    }

    default void ortMenzil(){
        menzil();
        System.out.println("Menzil ortalaması");
    }


}
