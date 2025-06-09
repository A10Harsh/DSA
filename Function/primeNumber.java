package Function;

public class primeNumber {

    public static boolean isprime(int n){
        boolean isprime = true;
        if (n==2){
            return true;
        }
        for (int i =2; i<=n-1; i++){
            if (n%i==0){
                return false;
            }
        }
        return isprime; 

    }

    public static void primeRange(int n){
        

        for (int j =2; j <=n; j++){
        
            if (isprime(j)==true){
               System.out.println(j+" ");
            }
            
        }
    
}

    
    public static void main(String[] args) {
        int n = 5; 
        boolean isprime = isprime(n);
        System.out.println(isprime);
        primeRange(n);


    }
}
