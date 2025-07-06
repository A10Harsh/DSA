package recursion;
public class occurrence{
    public static void occur(int [] arr, int idx,int key){
        if (idx == arr.length){
             
            return;
        }
        //work
        if (arr[idx] == key){
            System.out.println(idx);
            occur(arr, idx+1, key);
        }
        else{
            occur(arr, idx+1, key);
        }
    }
    public static void main(String[] args) {
        int [] arr = {1, 2,2, 3,4,2,5,2};
        occur(arr, 0, 2);
    }
}