package day46_AccessModifiers.Singleton;

public class SingleTest {
    public static void main(String[] args) {

        // Single single23 = new Single();
        Single.setMaxInstance(2);
        Single single = Single.getInstance();
        Single single1 = Single.getInstance();
        Single single2 = Single.getInstance();
        Single single3 = Single.getInstance();
        Single single4 = Single.getInstance();


        System.out.println("System.identityHashCode(single) = " + System.identityHashCode(single));
        System.out.println("System.identityHashCode(single1) = " + System.identityHashCode(single1));
        System.out.println("System.identityHashCode(single2) = " + System.identityHashCode(single2));
        System.out.println("System.identityHashCode(single3) = " + System.identityHashCode(single3));
        System.out.println("System.identityHashCode(single4) = " + System.identityHashCode(single4));

        System.out.println("single1.getMaxNumberOfInstance() = " + single1.getMaxNumberOfInstance());
    }
}
