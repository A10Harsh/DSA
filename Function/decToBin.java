package Function;

public class decToBin {
  public static void decBin(int decNum) {
        int pow = 0; 
        int binNum = 0;
        while (decNum>0){
            int lastdigit = decNum%2; // gives the last digit of number
            binNum = binNum + (lastdigit * (int)Math.pow(10,pow));
            decNum = decNum/2;
            pow++;
        }
        System.out.println("binary number of given number is "+ binNum);
    }
    public static void main(String[] args) {
        int binNum = 11;

        decBin(binNum);
    }
}

