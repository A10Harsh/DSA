import java.util.ArrayList;

public class pairSum1 {
     public static int pairSum(ArrayList<Integer> list, int target){
     int lp = 0;
     int rp = list.size()-1;
     int count =0;
     while (lp != rp){
        if (list.get(lp)+list.get(rp)==target){
            count ++;
        }
        if (list.get(lp)+list.get(rp)<target) {
            lp++;
        } else {
         rp--;   
        }
        
     }
     return count;
    }
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target = 7;
        System.out.println(pairSum(list, target));
       
}}
