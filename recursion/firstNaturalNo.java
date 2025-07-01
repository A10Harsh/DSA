package recursion;

import java.util.Scanner;

public class firstNaturalNo {
    public static int firstNum(int n ){
        if (n == 1){
            return 1;
        }
        
        int sum = n+ firstNum(n-1);
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print factorial");
        int n = sc.nextInt();
       System.out.println( firstNum(n)); // function calling
    }
    
}
