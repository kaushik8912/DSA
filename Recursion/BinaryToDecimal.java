public class BinaryToDecimal {
    static int decimal(int bin,int dec,int i){
        if(bin==0){
            return dec;
        }
        int rem = bin%10;
        dec=dec+rem*i;
        i=i*2;
        return decimal(bin/10, dec, i);
    }
    public static void main(String[] args) {
        System.out.println(decimal(1011, 0,1));
    }
}
