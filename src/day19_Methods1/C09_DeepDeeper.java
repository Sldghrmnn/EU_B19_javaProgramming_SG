package day19_Methods1;

public class C09_DeepDeeper {
    public static void main(String[] args) {
        System.out.println("start");
        deep();
        deep();
        deeper();
        deep();
        //C07_Amazon.amazonLogin();
        System.out.println("finish");
    }
    public static void deep(){
        System.out.println("Deep metodunun ici");
        deeper();
        System.out.println("Hala deep metodundayiz");
    }
    public static void deeper(){
        System.out.println("Deeper metodunun ici");
    }
}
