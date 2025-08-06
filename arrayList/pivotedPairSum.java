import java.util.ArrayList;

public class pivotedPairSum {
    public static boolean pairSum(ArrayList<Integer> list, int target){
     int bp = -1; // intilization of pivote point
     int n = list.size();
     for (int i = 0; i< list.size(); i++){
        if (list.get(i)> list.get(i+1)){
            bp = i;
            break;
        }
     }
     int rp = bp;
     int lp = bp+1;

     
     int count =0;
     while (lp != rp){
        if (list.get(lp)+list.get(rp)==target){
          return true;
        }
        if (list.get(lp)+list.get(rp)<target) { // case 2; updating the left pointer to move ahead using moudulp
           lp = (lp+1)%n;
        } else {                                // case 3; updating the right pointer to move backward using modulo
         rp = (rp+n-1)%n;
        }
        
     }
     return false;
    }
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(10);

        int target = 16;
        System.out.println(pairSum(list, target));
}
}