public class CountDigit {
    static void countDigit(int num, int count) {
        if (num == 0) {
            System.out.println(count);
            return;
        }
        countDigit(num / 10, count + 1);
    }

    public static void main(String[] args) {
        countDigit(9765132, 0);
    }
}
