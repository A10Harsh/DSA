package bitmanipulation;

;

public class evenodd {// used & operator with 1 which give the lsb of number 
    public static void checkNum(int n){
        int bitmask = 1;
        if ((n & bitmask)== 0){
            
            System.out.println("entered number is even");
        }
        else{
            System.out.println("entered number is odd");
        }
    }
    public static void main(String[] args) {
        checkNum(8);
    }
}
