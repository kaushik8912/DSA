public class PowerOfNo {
    static int power(int n, int pwr){
        if(pwr==0){
            return 1;
        }
        return power(n, pwr-1)*n;
    }
    
    public static void main(String[] args) {
        System.out.println(power(2, 6));
        
    }
}
