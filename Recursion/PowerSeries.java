public class PowerSeries {
    static void powerof(int n,int res,int range){
        if(range==0){
            return ;
        }
         System.out.print(res+",");
         
         powerof(n,res*n ,range-1);
        }
    public static void main(String[] args) {
        powerof(3,1,10);
    }
}
