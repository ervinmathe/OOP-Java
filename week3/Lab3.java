import BankAccount;
import Customer ;

public class Lab3 {


    public static void main(String[] args) {
        //oop.labor02.BankAccount acc1 = new oop.labor02.BankAccount("001") ;
        //oop.labor02.BankAccount acc2 = new oop.labor02.BankAccount("002" , 2000) ;


        //System.out.println(acc1.currentState());
        //System.out.println(acc2.currentState());

        // Customer c1 = new Customer("Mathe" , "Ervin" , acc1) ;
        // System.out.println(c1);
        // System.out.println(c1);

        // c1.getAccount().deposit(2000);





        // oop.labor02.BankAccount acc2 = new oop.labor02.BankAccount("BT002" , 0) ;
        // Customer c2 = new Customer("Marry" , "White" , acc2) ;
        // System.out.println(c2);

        // c2.getAccount().deposit(5000);
        // c2.getAccount().closeAccount();
        // System.out.println(c2);

        // c2.setAccount(acc1); 

        // System.out.println("\n" + c1);
        // System.out.println(c2);


        Customer c1 = new Customer("Mathe" , "Ervin" , null) ;
        BankAccount acc1 = new BankAccount("OTP001") ;
        BankAccount acc2 = new BankAccount("BT002" , 2000) ;
        c1.addAccount(acc1);
        c1.addAccount(acc2);
        System.out.println(c1);

    }
}