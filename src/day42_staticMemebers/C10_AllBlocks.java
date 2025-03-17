package day42_staticMemebers;

public class C10_AllBlocks {

    static int x;
    int y;

    public C10_AllBlocks(){
        System.out.println("Parametresiz constructor");
    }

    public C10_AllBlocks(int i){
        System.out.println("Parametreli constructor");
    }

    static {
        System.out.println("static blok - 1");
       // System.out.println(y);//erisimi yoktur
    }

    {
        System.out.println("Instance blok - 1");
    }

    static {
        System.out.println("static blok - 2");
    }

    {
        System.out.println("Instance blok - 2");
    }


    public static void main(String[] args) {
        //static blok main metotdan bile once calisir
        System.out.println("Test basladi");
        C10_AllBlocks obj1 = new C10_AllBlocks();
        C10_AllBlocks obj2 = new C10_AllBlocks(2);
    }
}
