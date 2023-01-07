package Recursion;

public class PrimeNumber {
    static boolean isPrime(int n, int i) {
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);

    }

    public static void main(String[] args) {
        boolean result = isPrime(133, 2);
        System.out.println(result);

    }
}
