class SumofDigit{
    static int sum(int n,int sum){
        if(n==0){
            return 0;
        }
        int rem = n %10;          
        return sum(n/10, sum)+rem;
    }
    
    public static void main(String[] args) {
        System.out.println("Sum is : "+sum(12345, 0));
    }
}