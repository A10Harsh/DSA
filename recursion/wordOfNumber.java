package recursion;

public class wordOfNumber {
    static String  digit[] = { "zero", "one","two","three","foru","five","six", "seven","eight", "nine", "ten"};
    public static void printWord(int n ){
        if ( n == 0){
            return;
        }
        int lastdigit = n%10;
        n = n/10;
        printWord(n);
        System.out.println(digit[lastdigit]);
    }
    public static void main(String[] args) {
        printWord(1233);
    }
}
