package Recursion;

public class Print1to10 {
    static void printValue(int num){
        //termination condition
        if (num==0) {
            return;
            
        }
        //Processing logic
        //small Problem
        printValue(num-1);
        //stack fall
        System.out.println(num);
    }
    public static void main(String[] args) {
        printValue(10);
    }
}
