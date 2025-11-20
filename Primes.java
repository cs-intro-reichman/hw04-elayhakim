public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int p){
        for(int i=2;i<p;i++){
            if(p%i==0){
                return false;
            }
        }
        return true;
    }
}