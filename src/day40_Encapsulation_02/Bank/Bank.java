package day40_Encapsulation_02.Bank;

import java.util.ArrayList;

public class Bank {
    private String name;
    private String adress;

    private ArrayList<Customer> customers;

    public Bank(String name, String adress) {
        /*
        this.name = name;
        this.adress = adress;
         */
        setName(name);
        setAdress(adress);
        customers=new ArrayList<>();
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name.trim();}

    public String getAdress() {return adress;}

    public void setAdress(String adress) {
        this.adress = adress.trim();
    }

    public ArrayList<Customer> getCustomers() {
        return new ArrayList<>(customers);
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    @Override
    public String toString() {
      String str  ="";
      str += "Name of Bank       : "+this.name+"\n";
      str += "Adress of Bank    : "+this.adress+"\n";
      str += "Customers of the Bank "+"\n";
      str += "------------------------------------\n";

      for (Customer customer :getCustomers()) {
          str += customer.toString();
      }
      return str;
    }
}
