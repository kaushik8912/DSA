public class AdjacentStars {
    static   String NewStr = "";
    static void stars(String str,int i){
        NewStr +=str.charAt(i);
        if(i==str.length()-1){
            return;
        }
        if(str.charAt(i)==str.charAt(i+1)){
        NewStr+="*";
        }
        stars(str, i+1);
        
       
    }
    public static void main(String[] args) {
        String str = "abbbabaab";
        System.out.println(str);
        stars(str, 0);
        System.out.println(NewStr);
    }
}
