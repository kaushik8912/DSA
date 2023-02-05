public class ReplacePI {
    static String replacePI(String str, int i) {
        if (i == str.length()) {
            return "";
        }
        if (str.charAt(i) == 'p' && str.charAt(i + 1) == 'i') {
            return "3.14" + replacePI(str, i + 2);

        } else {
            return str.charAt(i) + replacePI(str, i + 1);
        }
    }

    public static void main(String[] args) {
        String str = "2*pi+3*pi=5*pi";
        System.out.println(str);
        System.out.println(replacePI(str, 0));
    }
}
