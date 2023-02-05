public class Powerof4 {
    static boolean isPowerof4(int n){
        if(n==1 || n==4){
            return true;
        }
        if(n%4!=0 || n==0){
            return false;
        }
        return isPowerof4(n/4);
    }
    public static void main(String[] args) {
        System.out.println(isPowerof4(256)); 
    }
}
