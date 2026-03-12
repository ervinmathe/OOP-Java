
import java.util.ArrayList;
import java.util.List;

import week2.BankAccount;

public class Customer {
    private String firstName ;
    private String lastName ; 
    static final int MAX_ACCOUNT = 10 ;
    int numberOfAccounts = 0 ;
    List<BankAccount> accounts = new ArrayList<>() ;


    public Customer(String firtName , String lastName , BankAccount account) {
        this.firstName = firtName ;
        this.lastName = lastName ;
        addAccount(account);
    }
    public Customer(String firtName , String lastName ) {
        this.firstName = firtName ;
        this.lastName = lastName ;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public BankAccount getAccount(String accountNumber) {
        for(BankAccount account : accounts) {
            if(account.getAccountNumber().equals(accountNumber)) {
                return account ;
            }
        }
        return null ;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "" + firstName + " " + lastName + " " + accounts.stream().map(a -> a.currentState()).reduce("", (a, b) -> a + "\n" + b) ;
    }

    public void addAccount(BankAccount account) {
            accounts.add(account) ;
            numberOfAccounts++ ;      
    }


    public void closeAccount(String accountNumber) {
        BankAccount account = getAccount(accountNumber) ;
        if(account == null) {
            System.out.println("Account not found") ;
            return ;
        }
        account.closeAccount();
        numberOfAccounts-- ;
    }


}