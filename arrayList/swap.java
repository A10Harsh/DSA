import java.util.ArrayList;

public class swap {
    public static void swapList(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        
    
    ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("before swapping"+list);
        swapList(list, 2, 3);

        System.out.println("after Swapping"+ list); 
        
       
}
}