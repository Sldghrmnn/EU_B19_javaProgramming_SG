package day40_Encapsulation_02.Bank;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
       // this.name = name;
        setName(name);
        accounts =new ArrayList<>();
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name.trim();}

    public ArrayList<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account){
        this.accounts.add(account);
    }

    public void depositMoney(Account account,double miktar){
        account.setBalance(miktar);
    }

    public void paraCekme(Account account,double miktar){
        account.withdraw(miktar);
    }

    public String toString(){

        String str = "";
        str += name + "\n";
        str += "Account of customer \n";
        str += "--------------------\n";

        for (Account account :getAccounts() ) {
            str += account + "\n";
            str += "\n";
        }
        return str;
    }

}
