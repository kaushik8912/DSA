package Recursion;

public class FibSeries {
    static int fib(int n) {
        int result = 0;
        int first = 0;
        int second = 1; 
        for (int i = 1; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fib(6));

    }
}
