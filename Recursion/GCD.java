public class GCD {
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        if(b==0){
        return a;
        }
        if(a==b){
            return a;
        }
        if(a>b){
            return gcd(a-b, b);
        }
        return gcd(a, b-a);
    }

    public static void main(String[] args) {
        System.out.println(gcd(98, 56));
    }
}
