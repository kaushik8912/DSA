public class TowerOfHanoi {
    static void tower(int n, String source,String helper,String destination){
        if(n==1){
            System.out.println("Transfer disk "+ source +" to "+ destination );
            return;
        }
        tower(n-1, source, destination,helper);
        System.out.println("Transfer disk " +  source +" to "+ destination );
        tower(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        tower(2, "Source", "Helper", "Destination");
    }
   
}
