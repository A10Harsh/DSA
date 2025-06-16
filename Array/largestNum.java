import java.util.*;

public class largestNum {
    public static int findLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i< arr.length; i++){
            if (largest< arr[i]){
                largest = arr[i];
            }
            if(smallest>arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("smallest is"+ smallest);

        return largest;
    }
    public static void main(String[] args) {
         int [] number = {1,2,3,7,5,6};
         int largest = findLargest(number);
         System.out.println("largest number in array " + largest);
    }
}
