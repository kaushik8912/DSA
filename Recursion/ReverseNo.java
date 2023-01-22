public class ReverseNo {

    static int reverseNo(int n,int result){
        if(n==0){
        System.out.println(result);

            return 1;
        }
        int rem = n%10;
        result = result*10 +rem;
        return reverseNo(n/10,result);
    
    }

    public static void main(String[] args) {
        reverseNo(987654321,0);
        
    }
}
