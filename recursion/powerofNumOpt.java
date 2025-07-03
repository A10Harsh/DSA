package recursion;

public class powerofNumOpt {
    public static int optimizedPower(int a,int n){
         if (n==0){
            return 1;
        }
        int halfpower= optimizedPower(a, n/2);
        int halfPowerSq = halfpower * halfpower;
        if ( n%2 != 0){
            halfPowerSq = a*halfPowerSq;
        }
        return halfPowerSq;

    }
        public static void main(String[] args) {
        System.out.println(optimizedPower(2, 10));
    }

}
