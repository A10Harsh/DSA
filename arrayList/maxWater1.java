
   import java.util.ArrayList;

public class maxWater1 { // solving the problem in linear time complexity by poiter approaches
 


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8); 
        list.add(3);
        list.add(7);
        int maxContain = 0;
        int lp =0; 
        int rp =list.size()-1;

        while(lp!=rp){
            int ht = Math.min(list.get(lp), list.get(rp));
            int width = rp-lp;
            int currentContain = ht*width;
            maxContain = Math.max(maxContain,currentContain);

            if(list.get(lp)< list.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }

          System.out.println(maxContain);
    }
}


