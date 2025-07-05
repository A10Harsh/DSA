package bitmanipulation;
 class ClearLastBit {
    public static int clearIbits(int n, int i) {
        int bitMask = (~0) << i;  // Creates a mask with last i bits = 0
        return n & bitMask;       // Clears the last i bits of n
    }

    public static void main(String[] args) {
        int result = clearIbits(5, 2);  // 5 = 101 → clearing last 2 bits → 100 = 4
        System.out.println(result);     // Output: 4
    }
}
