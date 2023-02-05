public class Pattern7 {
    static void printSpace(int col){
        if(col == 0) {
            return;
        }
        System.out.print(" ");
        printSpace(col - 1);
    }
    static void printStar(int col) {
        if(col == 0) {
            return;
        }
        printStar(col - 1);
        System.out.print("*");

    }
    static void printPattern(int row,int col){
        if(row==0){
            return;
        }
        printPattern(row-1, col+1);
        printSpace(row-1);
        printStar(2*col-1);
        System.out.println();
    
    }
    public static void main(String[] args) {
        printPattern(5, 1);
    }
}
