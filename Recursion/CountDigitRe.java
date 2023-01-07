package Recursion;

public class CountDigitRe {
    static int countDigit(int num){
        if(num==0){
            return 0;

        }
        return 1 + countDigit(num/10);
        // int r=countDigit(num/10);
        // return ++r;
    }
    public static void main(String[] args) {
        System.out.println(countDigit(76254));
        
    }
}
