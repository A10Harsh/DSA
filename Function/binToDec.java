package Function;


public class binToDec {


    public static void binDec(int binNum) {
        int pow = 0; 
        int decNum = 0;
        while (binNum>0){
            int lastdigit = binNum%10; // gives the last digit of number
            decNum = decNum + lastdigit * (int)Math.pow(2,pow);
            binNum = binNum/10;
            pow++;
        }
        System.out.println("binary number of given number is "+ decNum);
    }
    public static void main(String[] args) {
        int binNum = 111;

        binDec(binNum);
    }
}
