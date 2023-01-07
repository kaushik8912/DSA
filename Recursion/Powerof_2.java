package Recursion;

public class Powerof_2 {
static boolean check(int n){

    if(n==1 || n==2)
    return true;

    if(n%2==1 || n==0)
    return false;
    return check(n/2);

}
    public static void main(String[] args) {
        System.out.println(check(128)); 
    }
    
}
