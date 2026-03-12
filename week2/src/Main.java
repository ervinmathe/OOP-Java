package week2;
import java.util.Random;
import Dateutil ;

public class Main {
    public static void main(String[] args) {
        /*BankAccount myBank = new BankAccount("Ervin") ;

        myBank.deposit(20000);

        System.out.print(myBank.getBalance()) ;

        myBank.withDraw(40000000) ;

        System.out.print(myBank.getBalance()) ;*/



        ///Rectangle myRec = new Rectangle(3, 2) ;

        // System.out.println("Ez a teglalap hosszusaga: " + myRec.getLength() + " es a szelessege: " + myRec.getWidth());
        // System.out.println("A terulete: " + myRec.area() + ' ' + " es a kerulete: " + myRec.perimeter()) ;
        

        // Rectangle[] myRectangles = new Rectangle[10] ;
        // System.out.println("A tomb elemei: ") ;
        // random rand = new Random();
        // double sum = 0.0 ;
        // for(Rectangle rec : myRectangles) {

        //     double length = 1 + rand.nextInt(10);
        //     double width = 1 + rand.nextInt(10) ;
        //     rec = new Rectangle(length, width);
        //     System.out.println("Ez a teglalap hosszusaga: " + rec.getLength() + " es a szelessege: " + rec.getWidth());
        //     System.out.println("A terulete: " + rec.area() + ' ' + " es a kerulete: " + rec.perimeter()) ;
        //     sum += rec.area() ;
        // }



        int year = 2025 ;
        int month = 4 ;
        int day = 30 ;

        System.out.println(Dateutil.isValidDate(year, month, day)) ;


        
        

    }
}
