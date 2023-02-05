public class PrimeNo {
    static boolean isPrime(int num, int i) {
        if (num % i == 0) {
            return false;
        }
        if (i * i > num) {
            return true;
        }
        return isPrime(num, i + 1);

    }

    public static void main(String[] args) {
        boolean result = isPrime(199, 2);
        System.out.println(result);

    }
}
