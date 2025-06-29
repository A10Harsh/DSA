public class pairsArray {
    public static void pairArr(int arr[]){
        int []newarr = arr;
        for (int i = 0; i<newarr.length; i++){
            for (int j = i+1; j<newarr.length; j++){
                System.out.print("("+newarr[i]+","+newarr[j]+")");
            }
            System.out.println();
        }
    }
    public static void totalPair(int arr []){
        int n = arr.length;
        n = (n *(n-1))/2;
        System.out.println(n);
    }
    public static void main (String[] args){

        int[ ] arr = { 12, 13, 14,15, 16, 17};
        pairArr(arr);
        totalPair(arr);
    }
}
