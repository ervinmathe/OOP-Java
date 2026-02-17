import java.math.pow;
import java.lang.Math;

public class Functions {


    public static double maxElement(double array[]){
        double max = Double.NEGATIVE_INFINITY;
        for(int i=0;i<array.length;++i){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }


    int a ; 
    public static byte getBit(int n , int order) {

        if(order >= 32) {
            throw new RuntimeException("Nem letezik ilyen bit") ;
        }
        n = n >> order ;
        return (byte)(n & 1) ; 
    }

    public static int countBits(int n) {
        int count = 0 ;
        while (n > 0) {
            int temp = n & 1 ;
            if(temp == 1) {
                count++ ;
            }
            n = n >> 1 ;
        }
        return count;
    }

    public static double mean(double array[]) {
        if(array.length == 0) {
            return Double.Nan ;
        } else {
            double sum = 0.0 ;
            for(int i = 0 ; i < array.length ; i++) {
                sum += array[i] ;
            } 
            
            return sum / array.length ;
        }
    }

    public static double STD(int array[]) {

        if(array.length == 0) {
            return Double.NaN ;
        }
        double mean = mean(array) ;
        int absSum = 0 ;
        for(int i = 0; i < array.length; i++) {
            absSum += pow(Math.abs(array[i] - mean) , 2) ;
        }
        return Math.sqrt(absSum / array.length) ;
    }

    public static void main(String[] args) {
    
    }
    
}
