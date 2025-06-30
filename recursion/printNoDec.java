package recursion;
import java.util.*;
public class printNoDec {
    public static void printNo(int n){
        if (n ==1){// base case
            System.out.println(n);
            return;
        }
        System.out.println(n); // printing while filling the stack
        printNo(n-1); // calling the recursive function
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print upto decreasing order"); // user input
        int n = sc.nextInt();
        printNo(n); // calling function

    }
}
