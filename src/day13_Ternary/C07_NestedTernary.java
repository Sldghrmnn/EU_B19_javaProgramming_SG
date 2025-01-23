package day13_Ternary;

public class C07_NestedTernary {
    public static void main(String[] args) {
        // verilen 3 rakamdan en buyugunu yazdiran kod nedir ?

        int x = 10;
        int y = 20;
        int z = 30;
        int max;
     // if-else

     if (x > y){
         if (x > z){
             max = x;
         }else {
             max = z;
         }
     }else if (y > z){
         max = y;
     }else {
         max = z;
     }
        System.out.println("max = " + max);

     // else if  2. yol
         if (x >y && x >z){
         max = x;
         }else if (y > z){
         max = y;
         }else{
         max = z;
         }
        System.out.println("max = " + max);

         // ternary

    int max1 = x > y
              ? x > z ? x : z
              : y > z ? y : z;
        System.out.println("max1 = " + max1);

        int max2 = (x > y && x > z)
                 ? x
                 : y > z ? y : z;
        System.out.println("max2 = " + max2);


        int max3 =(x > y)
                 ? (x > z) ? x : z
                 : (y > z) ? y : z;
        System.out.println("max3 = " + max3);
    }
}
