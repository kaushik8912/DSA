public class DecimalToBinary {
    static void binary(int num){
        if(num==0)
        return ;
         binary(num/2);
        if(num%2==1){
            System.out.print(1);
        }
        if(num%2==0){
            System.out.print(0);
        }
}
    public static void main(String[] args) {
        binary(11);
    }
}
