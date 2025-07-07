public class subArray { // sub array is continours part of array
    public static void subarr(int []arr){
        
         for (int i = 0; i<arr.length; i++){
            for (int j = i; j<arr.length; j++){
                for (int k  = i; k<= j; k++){
                 System.out.print(arr[k]+" ");
                }
               System.out.println();
            }
           System.out.println();  
        }
     
    }

     public static void totalPair(int arr []){
        int n = arr.length;
        n = (n *(n+1))/2;
        System.out.println(n);
    }

    
    public static void main(String[] args) {
    
    int[ ] arr = { 12, 13, 14,15, 16, 17};
    subarr(arr);
    totalPair(arr);
    }
}
