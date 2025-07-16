package bitmanipulation;

public class clearbit {
    public static int clear (int n , int i){
        int bitmask = ~(i<<i);
        return (n & bitmask);
    }
    public static void main(String [] args){
       System.out.println( clear(10, 1));
    }
    
}
