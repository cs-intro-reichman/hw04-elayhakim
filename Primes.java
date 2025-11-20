public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int count = 0;
        System.out.println("Prime numbers up to " + n + ":");
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + (int)(1.0*count/(n-1)*100) + "% are primes)");

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