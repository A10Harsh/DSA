package sorting;

public class selection {
    public static void selectionShort(int arr[]){
        for (int i = 0; i< arr.length-1; i++){
            int minPos = i ;
            for (int j = i+1; j<arr.length; j++){
                if (arr[minPos]>arr[j]){
                     minPos = j;
                }}
                //swap 
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            
        }
     for (int i = 0; i< arr.length; i++){
        System.out.print(arr[i]); 
    }}
    public static void main(String[] args) {
        int [] number = {6,1,2,4,3,5,};
        selectionShort(number);
}}
