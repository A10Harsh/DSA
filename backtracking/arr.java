public class arr {
    public static void changearr(int arr[], int i, int val){
        if (i == arr.length){ // base case
            printArr(arr); 
            return;
        }
        arr [i]= val;
        changearr(arr, i+1, val+1); // recursive call
        arr[i] = arr[i]-2; //backtrackig  step
        }
    public static void printArr(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
            int arr[]= new int[5]; 
            changearr(arr, 0, 0);
            printArr(arr);}
}
