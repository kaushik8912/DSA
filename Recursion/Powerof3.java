public class Powerof3 {
    static boolean isPowerof3(int n){
        if(n==1 || n==3){
            return true;
        }
        if(n%3!=0 || n==0){
            return false;
        }
        return isPowerof3(n/3);
    }
    public static void main(String[] args) {
        System.out.println(isPowerof3(27)); 
    }
}
