package sorting;

public class counting {
    public static void countingShort(int arr[]){
         
        int max = Integer.MIN_VALUE;
        for (int i =0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }

        int []count = new int [max+1];

        for (int i = 0; i< arr.length; i++){
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i<count.length; i++){
         while (count[i]>0) {
            arr[j] = i;
            j++;
            count[i]--;
            
        }}
for (int i = 0; i< arr.length; i++){
        System.out.print(arr[i]); 
}}
    public static void main(String[] args) {
        int [] number = {6,1,2,4,3,5,};
       countingShort(number);


    }
    
}
