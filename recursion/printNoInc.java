package recursion;

import java.util.Scanner;

public class printNoInc {
    public static void printNo(int n){
        if (n ==1){
            System.out.println(n);
            return;
        }
        printNo(n-1); 
        System.out.println(n); 
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print upto increasing order");
        int n = sc.nextInt();
        printNo(n);

    }
}
