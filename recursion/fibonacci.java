package recursion;
public class fibonacci{
    public static int fiboSum(int n){
        if (n == 1 || n ==0){
            return n;
        }
        
        int fnm1= fiboSum(n-1);
        int fnm2 = fiboSum(n-2);
        int fn = fnm1+ fnm2;
        return fn;

    }
    public static void main(String [] args){
        System.out.println(fiboSum(10));
    }
}