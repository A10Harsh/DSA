public class binarySearch {
    public static int findNum(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if (arr[mid]== key){
              return mid;
            }
           if (arr[mid]> key){
                end = mid-1;
            }
            if (arr[mid]< key){
                start = mid+1;
            }
        }
        return -1;
    }

   


    public static void main(String[] args) {
        int [] number = {1,2,3,7,5,6};
        int key = 5;
        int largest = findNum(number, key);
        System.out.println("key index "+ largest);
    }
}
