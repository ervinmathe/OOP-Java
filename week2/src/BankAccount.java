package week2;

public class BankAccount {
    private String AccountNumber ;
    private double balance ;

    public BankAccount(String str) {
        AccountNumber = str ;
    }
    public BankAccount(String str , double balance) {
        AccountNumber = str ;
        this.balance = balance ;
    }

    public BankAccount(String str , int balance) {
        AccountNumber = str ;
        this.balance = balance ;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount ;
    }

    public void withDraw(double amount) {
        if(amount > balance) {
            return ;
        }

        balance -= amount ;
    }

    public String currentState() {
        return "" + AccountNumber + " " + balance ;
    }

    public void closeAccount() {
        balance = 0 ;
        AccountNumber = null ;
    }
    
}