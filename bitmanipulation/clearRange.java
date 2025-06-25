package bitmanipulation;

public class clearRange {
    public static int clearRangebits(int n, int i ,int j){
        int a = ((~0)<< (j+1));
        int b = (i<<i) -1;
        int bitMask= a|b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearRangebits(15, 02, 3));
    }
}
