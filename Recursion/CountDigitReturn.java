package Recursion;

public class CountDigitReturn {
    static int countDigit(int num, int count) {
        if (num == 0) {
            return count;
        }
        return countDigit(num/10, count+1);
        // int r = countDigit(num / 10, count + 1);
        // return r;
    }

    public static void main(String[] args) {
        int e = countDigit(76432, 0);
        System.out.println(e);
    }
}
