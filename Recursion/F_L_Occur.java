public class F_L_Occur {
    public static int first = -1;
    public static int last = -1;

    static void occur(String s, int index, char element) {
        if (index == s.length()) {
            System.out.println(first+1);
            System.out.println(last+1);
            return;
        }
        char currchar = s.charAt(index);
        if (currchar == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        occur(s, index + 1, element);
    }

    public static void main(String[] args) {
        occur("aabhcadbah", 0, 'b');
    }

}
