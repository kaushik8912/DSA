class ClimbStairs{
    static int climbStairs(int num){
        if( num ==1){
            return 1;
        }
        if(num==2){
            return 2;
        }
       int x=climbStairs(num-2);
       int y =climbStairs(num-1);
       return x+y;
       
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}