public class Table {
    static void show(int n,int count){
        if(count==11){
            return;
        }
        System.out.println(n*count);
        show(n, count+1);
    }
    public static void main(String[] args) {
        show(5, 1);
    }
}
