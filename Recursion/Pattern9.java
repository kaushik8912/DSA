public class Pattern9 {
    static void printStar(int col) {
        if(col == 0) {
            return;
        }
       
        printStar(col-1);
        System.out.print(col);
      
    }
    static void printPattern(int row,int col){
        if(row==0){
            return;
        }
        printStar(col);
        System.out.println();
        printPattern(row-1, col+1);
    
    }
   
    public static void main(String[] args) {
        printPattern(4, 1);
    }
}
