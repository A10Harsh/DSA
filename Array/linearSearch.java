public class linearSearch {


    public static int Search(int arr[], int key){
        for(int i = 0; i< arr.length; i++){
            if (key == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5,6};
        int num = 2;
        int res = Search(number, num);
        if (res == -1){
            System.out.println("key not found");
        }
        else{
            System.out.println(num+" found at index "+res);
        }
    }
}
