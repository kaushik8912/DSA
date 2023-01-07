package Recursion;

public class SumofDigit {
    static void sum(int n, int sum) {
        if (n != 0) {

            return;
        }
        int r = n % 10;
        sum(n / 10, sum = sum + r);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sum(12345, 0);

    }

}
