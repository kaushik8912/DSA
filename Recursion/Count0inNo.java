public class Count0inNo {
    static void count0(int num, int count) {
        if (num == 0) {
            System.out.println(count);
            return;
        }
        if(num%10==0){
            count++;
        
        }
        count0(num / 10, count);
    
}

    public static void main(String[] args) {
        count0(10000, 0);
    }
}
