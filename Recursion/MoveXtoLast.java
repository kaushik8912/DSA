public class MoveXtoLast {
    static void moveX(String str,int index,int count,String newstring){
        if(index==str.length()){
            for(int i=0;i<=count;i++){
                newstring+='x';
                }
             System.out.println(newstring);
            return;
        }
        char currchar = str.charAt(index);
        if(currchar=='x'){
            count++;
            moveX(str, index+1, count, newstring);
        }
        else{
            newstring +=currchar;
            moveX(str, index+1, count, newstring);
        }
    }
    public static void main(String[] args) {
        moveX("abxhgxxjuax", 0, 0, "");
    }
}
