package day07_TypeCasting;

import java.util.Scanner;

public class C08_FlightTicket {
    public static void main(String[] args) {

  /*
  task 1.
create a class named FlightTicket, and declare the following
variables:
1. from
2. to
3. ticketPrice
use concatenation to display the full info of the ticket

ex:
From Ankara to Istanbul is 599TL
*/
 Scanner input= new Scanner(System.in);

System.out.println(" Lutfen nereden ucacaginizi bildirin  : ");
String kalkisNoktasi= input.nextLine();

System.out.println("Lutfen nereye ucmak istediginizi bildirin : ");
String varisNoktasi= input.nextLine();

System.out.println("Ucus bedeli : +( tl )");
int ticketPrice= input.nextInt();

input.nextLine();

        System.out.println("kalkisNoktasi = " + kalkisNoktasi);
        System.out.println("varisNoktasi = " + varisNoktasi);
        System.out.println("ticketPrice = " + ticketPrice);

        System.out.println("From " +kalkisNoktasi + " to " +varisNoktasi  + " is " + ticketPrice +"TL");


    }
}
