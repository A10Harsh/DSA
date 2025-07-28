public class gridWays {
    public static int gridtWays(int i, int j, int m, int n){
        if ( i ==n-1 && j == m-1 ){
            return 1;
        }else if(i == n || j == m){
            return 0; 
        }

        int w1 = gridtWays(i+1, j, m, n);
        int w2 = gridtWays(i, j+1, m, n);
        return w1+w2;
    }
    public static void main(String[] args) {
       System.out.println( gridtWays(0, 0, 3, 3));
    }
}
