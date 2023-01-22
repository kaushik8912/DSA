public class Palindrome {
    static boolean isPalindrome(int n,int result,int reverse){
        if(n==0){
            if(result==reverse){
        return true;
            }
            return false;
        }
        int rem = n%10;
        result = result*10 +rem;
        return isPalindrome(n/10,result,reverse);
    
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1551, 0,1551)); 
    }
}
