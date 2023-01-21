class SumofNaturalNo{

static int sum(int n){
    //Base case
    if(n==1){
        return 1;
    }
    //small problem
    return sum(n-1)+n;
}


    public static void main(String[] args) {
    System.out.println("Sum is : "+sum(10));
    }
}