package recursion;
import java.util.*;
public class factorial {
    public static int fact(int n){
         if (n ==0){// base case
            return 1;
        }
        
        int fn = n * fact(n-1);
         //calling the function
        return fn; // printing while clearing the stack
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print factorial");
        int n = sc.nextInt();
       System.out.println( fact(n)); // function calling

    }
    }

