public class Powerof2 {
    static boolean isPowerof2(int n){
        if(n==1 || n==2 ){
            return true;
        }
        if(n%2==1 || n==0){
            return false;
        }
        return isPowerof2(n/2);
    }
    public static void main(String[] args) {
        System.out.println(isPowerof2(12)); 
    }
}
