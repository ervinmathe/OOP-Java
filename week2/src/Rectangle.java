package week2;

public class Rectangle {
    private double width = 1 ;
    private double length = 2 ; 

    public Rectangle(double l , double w) {
        if(l > 0 && w > 0) {
            length = l ;
            width = w ;
        }
        
    }

    public double getWidth() {
        return width ;
    }

    public double getLength() {
        return length ;
    }

    public double area() {
        return width * length ;
    }

    public double perimeter() { 
        return 2 * width + 2 * length ;
    }

}