public class Pattern3 {
    static void printStar(int cols) {
        if(cols == 0) {
            return;
        }
        System.out.print("*");
        printStar(cols -1);
    }
    // static void printPattern(int row,int col){
    //     if(row==0){
    //         return;
    //     }
    //     printStar(col);
    //     System.out.println();
    //     printPattern(row-1, col+1);
    
    // }
    static void printPattern(int rows, int cols) {
        if(rows == 0) {
            return;
        }
        printPattern(rows - 1, cols);
        printStar(rows);
        System.out.println();
    }
    public static void main(String[] args) {
        printPattern(5, 5);
    }
}
