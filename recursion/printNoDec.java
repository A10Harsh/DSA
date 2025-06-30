package recursion;
import java.util.*;
public class printNoDec {
    public static void printNo(int n){
        if (n ==1){// base case
            System.out.println(n);
            return;
        }
        System.out.println(n); 
        printNo(n-1); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print upto decreasing order");
        int n = sc.nextInt();
        printNo(n);

    }
}
