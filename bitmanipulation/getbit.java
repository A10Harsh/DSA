package bitmanipulation;

public class getbit {
     public static void bit(int n, int i){ // we make right shift operation which shift the 1 to desired position of bit
        int bitmask = 1<<i;
        if ((n & bitmask)== 0){
            
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
    public static void main(String[] args) {

        bit(8, 2);
    }
}
