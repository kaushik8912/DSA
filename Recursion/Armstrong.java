public class Armstrong {

    static boolean isArmstrong(int num,int result,int temp){
       if(num==0){
        if(result==temp){
            return true;
        }
        return false;
       }
        int rem = num%10;
        result=result+(rem*rem*rem);     
        return isArmstrong(num/10, result,temp);
    
}
    public static void main(String[] args) {
        boolean ans=(isArmstrong(153, 0,153)) ;
        System.out.println(ans);
    }

}
