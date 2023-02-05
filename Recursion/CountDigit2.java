public class CountDigit2 {
    static int countDigit(int num, int count) {
        if (num == 0) {
            return count;
        }
        return countDigit(num / 10, count + 1);
    }

    public static void main(String[] args) {
        System.out.println(countDigit(9765132, 0)); 
    }
    
}
