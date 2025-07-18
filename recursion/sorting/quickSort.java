package recursion.sorting;

public class quickSort {
    public static void printarr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
}

 public static void quicksort(int arr[], int si, int ei){
            if (si>=ei){
                return;
            }
        int pidx = partition(arr,si,ei);
        quicksort(arr, si, pidx-1); // left part
        quicksort(arr, pidx+1, ei); //right part
        }
        public static int partition(int arr[],int si, int ei){
            int pivot =arr[ei];
            int i = si-1; // To make the space for elments smaller than pivot 
            for (int j = si; j<ei; j++){
                if (arr[j] <= pivot){
                    i++;
                    // swap
                    int temp = arr[j];
                    arr [j]= arr[i];
                    arr[i] = temp;
                }}
                i++;
                int temp = pivot;
                    arr [ei]= arr[i];
                    arr[i] = temp;
                    return i;
            
        }
        public static void main(String[] args) {
            int arr[]= {6,3,2,1,6,9,8};
            quicksort(arr, 0, arr.length-1);
            printarr(arr);
    }}
