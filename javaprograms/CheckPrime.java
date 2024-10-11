package javaprograms;

public class CheckPrime {
    public static void main(String[] args) {
        int n = 13;
       // checkSingleNumberPrime(n);
        checkPrimeInRange(2,20);
    }

    private static void checkPrimeInRange(int start, int last){

        for (int n = start; n <=last ; n++) {
            boolean isPrime=true;
            for (int div =2; div*div <=n ; div++) {
                if (n%div==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(n+" ");
            }
        }

    }
    private static void checkSingleNumberPrime(int n){
        boolean isPrime = true;

        // Check for numbers divisible by any number other than 1 and itself.
        for (int div = 2; div * div <= n; div++) {
            if (n % div == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && n > 1) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

}

