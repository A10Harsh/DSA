package recursion;

public class checkSorted {
    public static boolean isSorted(int arr[], int idx){
        if (idx == arr.length-1){ // base case
            return true;

        }
        if (arr[idx]>arr[idx+1]){
            return false;
        }
        return isSorted(arr, idx++);
    }
    public static void main(String []args){
            int []arr = {1,2,3,4,5};
            System.out.println(isSorted(arr, 0));
    }
}
