public class Fibonacci {

    static int fibonacci(int a,int b,int range){
        if(range==0){
            
            return 0;
        }
        int c = a+b;
        System.out.print(c+",");
        return fibonacci(b, c, range-1);

    }
    public static void main(String[] args) {
        int b=1;
        int a=0;
        System.out.print(a+","+b+",");
       fibonacci(0, 1,10);
    
    }
}

