package Recursion;
public class RecursionDemo {
    static void show(int n){
        //to stop a cycle
        //terminate 
        if(n>5){
            return;
        }
        System.out.println("Aayush...");//logic
        show(n+1);//cycle

    }
    public static void main(String[] args) {
        show(1);
    }
}
