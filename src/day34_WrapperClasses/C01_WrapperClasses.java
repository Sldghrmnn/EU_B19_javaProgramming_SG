package day34_WrapperClasses;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        System.out.println("Wrapper Class in Java");
        System.out.println("Primitive data types");

        boolean bl=true;
        byte by=12;
        short sh=12500;
        int i=123;
        long l=12343442332454l;
        float ft=1232321.4444f;
        double db=23454567123456712345345.33333;
        char c='A';

        System.out.println("bl = " + bl);
        System.out.println("by = " + by);
        System.out.println("sh = " + sh);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("ft = " + ft);
        System.out.println("db = " + db);
        System.out.println("c = " + c);


        //wrapper Classes
        //1.Constructor----> Bu kullanimdan kaldirilacak(deprecated)
        Integer iWrp = new Integer(1234);
        Integer iWrpStr = new Integer(12345);

        Boolean blWrp =new Boolean(true);
        Boolean blWrpStr =new Boolean("false");

        Byte byWrp = new Byte((byte)12);
        Byte byWrpStr = new Byte("123");

        Character chWrp=new Character('A');

        System.out.println("iWrp = " + iWrp);
        System.out.println("iWrpStr = " + iWrpStr);


        //2.--volueOf()
        Integer iWrpVl = Integer.valueOf(1000);
        Integer iWrpVlStr = Integer.valueOf("16423");

        Character chWrpVl = Character.valueOf('a');

        Boolean blWrpVl = Boolean.valueOf("True");
        Boolean blWrpVlStr = Boolean.valueOf(false);

        System.out.println("blWrpVl = " + blWrpVl);


        //3. Assigning Literal Way
        Integer iLtr = 4356;
        Character chLtr = 'C';
        Boolean blLtr = true;


        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        System.out.println("iWrpStr = " + iWrpStr);
        System.out.println("iWrpVl = " + iWrpVl);
        System.out.println(iWrpStr + iWrpVl);

        System.out.println("System.identityHashCode(iLtr) = " + System.identityHashCode(iLtr));
        System.out.println("System.identityHashCode(blWrp) = " + System.identityHashCode(blWrp));

        System.out.println("----------------------------------------");

        Integer sayi1 = 12345;
        Integer sayi2 = 12345;

        System.out.println("(sayi1==sayi2) = " +(sayi1 == sayi2)); // false
        System.out.println("sayi1.equals(sayi2) = " + sayi1.equals(sayi2)); //true

        sayi1=sayi2;
        System.out.println("System.identityHashCode(sayi1) = " + System.identityHashCode(sayi1));
        System.out.println("System.identityHashCode(sayi2) = " + System.identityHashCode(sayi2));

        //Integer cashing -128 ile 127 arasindaki sayilar icin == operatörü kullanilabilir

        Integer number1 = -128;
        Integer number2 = -128;

        System.out.println("(number1 == number2) = " + (number1 == number2));


    }
}
