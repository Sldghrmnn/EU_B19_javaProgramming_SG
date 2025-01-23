package day09_Review;

public class C06_LogicalOperatorsExample {
    public static void main(String[] args) {

      // 18+. Turkish
      // age>=18


      String name="Suleyman";
      int age= 34;
      String citizenship="Turkish";

      boolean isEligibileToVozte= age>=18 && citizenship.equals("Turkish");
      boolean isEligibileToVozte1= age>=18 && citizenship.equalsIgnoreCase("turkish");

        System.out.println("isEligibileToVozte = " + isEligibileToVozte);
        System.out.println("isEligibileToVozte1 = " + isEligibileToVozte1);

        System.out.println("------------------------");


       // findexScore >1100    limit
       // income >=25000       yillik gelir
       // age >=18  age <70m   18 den buyuk bis 70 den genc


    String name2="Selda";
    int findexScore= 1300;
    int age2= 29;
    int income= 60000;

    boolean isEligibileLoan= findexScore>1100 &&  income>=25000 && age2>=18 && age2<70;
        System.out.println(name2+ "Java bankasindan kredi almaya uygun = " + isEligibileLoan);
        System.out.println("-----------");


        String name3="Mike";
        int age3= 20;
        char gender='M';    //Male Female


        boolean isEligibileToBuyAlcohol= age3>=21 && (gender =='M' || gender =='F');
        System.out.println("isEligibileToBuyAlcohol = " + isEligibileToBuyAlcohol);



        String studenName="Ayse";
        double gpa= 3.1;
        int familyIncome= 20000;

        /*
        gpa>= 3.5
        familyIncome< 20000
         */
boolean bursAlmayaUygunmu=gpa>=3.5 || familyIncome< 20000;
        System.out.println("bursAlmayaUygunmu = " + bursAlmayaUygunmu);

        System.out.println("----------------------");


        boolean result= true;
        System.out.println("result = " + result);
        System.out.println("!result = " +! result);
        System.out.println("-----------------------");


        int examScore= 55;
        boolean isPassed= examScore>=60;
        boolean isFailed= !isPassed;

        System.out.println("isPassed = " + isPassed);
        System.out.println("isFailed = " + isFailed);
        System.out.println("!isPassed = " + !isPassed);

    }
}
