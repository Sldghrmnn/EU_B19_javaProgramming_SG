package day20_CustomMethods;

public class C04_PracticeTaks {
    public static void main(String[] args) {

         areaOfCircle(8);
         areaOfCircle(4);

        System.out.println( areaOfSquare(3.4));

        System.out.println( perimeterOfSquare(5));

    }


    /**
     * this method calculates the area of circle with given radius
     * dairenin alanini hesaplayan bir method yazin!
     * redius = yari cap
     * area = alan   ( Pi*r*r) alan hesaplama
     *
     *
     * @param radius
     * @return
     */
    public static double areaOfCircle(int radius){
        double area;
        area = Math.PI * Math.pow(radius,2);

        return area;
    }
    /**
     * method that can calculate the area of a square
     * kare'nin alanini heesaplayan bir metod yazin!
     * side --> kenar
     *
     * @param side
     * @return
     */
    public static int areaOfSquare(double side){

      return (int)Math.pow(side,2);
    }

    public static double perimeterOfSquare(int side){
        double cevre = 4 * side;
        return cevre;
    }



}
