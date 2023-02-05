public class Pattern2 {
    static void printStar(int col) {
        if(col == 0) {
            return;
        }
        System.out.print("*");
        printStar(col - 1);
    }
    static void printPattern(int row,int col){
        if(row==0){
            return;
        }
        printStar(col);
        System.out.println();
        printPattern(row-1, col-1);
    
    }
    public static void main(String[] args) {
        printPattern(5, 5);
    }
    // static void printStar(int cols) {
    //     if(cols == 0) {
    //         return;
    //     }
    //     System.out.print("*");
    //     printStar(cols - 1);
    // }

    // static void printPattern(int rows) {
    //     if(rows == 0) {
    //         return;
    //     }
    //     printStar(rows);
    //     System.out.println();
    //     printPattern(rows - 1);
    // }
    // public static void main(String[] args) {
    //     printPattern(5);
    // }
}
