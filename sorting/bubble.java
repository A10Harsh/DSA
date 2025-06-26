package sorting;

public class bubble { 
    public static void bubbleShort(int arr[]){ //bubble short method 
        for (int i = 0; i< arr.length-1; i++){
            for (int j = 0; j<arr.length-1-i; j++){
                if (arr[j]>arr[j+1]){
                //swap 
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;    }}
            
        }
     for (int i = 0; i< arr.length; i++){ //printing
        System.out.print("sorted array is "+arr[i]+" "); 
    }}
    public static void main(String[] args) {
        int [] number = {6,1,2,4,3,5,};
        bubbleShort(number);
}
}
