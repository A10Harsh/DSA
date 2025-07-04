package recursion;
/*this problem ask for how many ways tile can be placed on the floor to cover size of 2*n 
and tile size is 2*1
 */
public class tillingProblem {
    public static int tile(int n){// n is 2*N value
        if (n ==0 ||n ==1){
            return 1;
        } 
        int fnm1= tile(n-1); // vertical methods
        int fnm2 = tile(n-2); // horizontal methods
        return fnm1+fnm2;
    }
    public static void main(String[] args) {
        System.out.println(tile(4));
    }
}
