public class ReverseString {
    static void reverse(String str,int index){
        if(str.length()==index){
            return;
        }
        reverse(str, index+1);
        System.out.print(str.charAt(index));
    }
    public static void main(String[] args) {
        reverse("abcd",0);
    }
}
