public class maxSubArr { //brute force approach
    
   // sub array is continours part of array
    public static void subarr(int []arr){
        int max = Integer.MIN_VALUE;
        
         for (int i = 0; i<arr.length; i++){
            for (int j = i; j<arr.length; j++){
                int sum = 0;
                for (int k  = i; k<= j; k++){
                 sum += arr[k];
                }
                System.out.println(sum);
               if(sum> max){
                max = sum; 
               }
            }
           System.out.println(); 
        }
        System.out.println("maximum sub array sum using brute force "+ max);
     
    }

     public static void prefixArrSum( int arr [] ){ // Prefix array sum algorithm
        int [] prefixArrSum = new int[arr.length];
        prefixArrSum[0] = arr[0];
        for (int i =1; i<prefixArrSum.length; i++){
            prefixArrSum[i] = arr[i]+prefixArrSum[i-1];
        }
       
        int maxSubArr = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++){
            int sum = 0;
            for (int j = i; j < arr.length; j++){
                sum = i==0 ? prefixArrSum[j] : prefixArrSum[j]-prefixArrSum[i-1];
               
            }
            if (maxSubArr<sum){
                maxSubArr = sum; 
            }
        }
        System.out.println( "Max sub array sum using prefix sum "+maxSubArr);

     }


     public static void kadanearrSum(int [] arr){// Kadane algo states that on which point current sum less than Zero then make currsum zero
        int max = Integer.MIN_VALUE; 
        int cs = 0;

        for (int i = 0; i<arr.length; i++){
            cs =  cs+ arr[i];

            if (cs<0){
                cs=0; 
            }
            if (max<cs){
                max = cs;
            }
            
        }
        System.out.println("Max sub array sum using kadane Algo "+max);
     }
     
    
    public static void main(String[] args) {
    
    int[ ] arr = { 12, -13, -14,15, 16, 17};
    
    subarr(arr);
    prefixArrSum(arr);
    kadanearrSum(arr);
  
    }
}


