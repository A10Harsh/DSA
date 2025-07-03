package recursion;
public class powerOfNum {
    public static int powerNum(int a, int n){
        if (n==0){
            return 1;
        }
        return a * powerNum(a, n-1);
    }
    public static void main(String[] args) {
        System.out.println(powerNum(2, 10));
    }

}
