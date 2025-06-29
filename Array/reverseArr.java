public class reverseArr {
    public static void reverse(int arr1[]){
        int first = 0; int last = arr1.length-1;
        while (first<last) {
            //swap
            int temp = arr1[last];
            arr1[last] = arr1[first];
            arr1[first] = temp;
            
            first++;
            last--;
            
        }
      
    }
    public static void main(String[] args) {
        int [] number = {1,2,3,7,5,6};
        reverse(number);
        for (int i = 0; i<number.length; i++){
            System.out.print(number[i]);
        }
    }
}
