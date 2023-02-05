import java.util.HashMap;

public class FreqCount {
    static HashMap<Character, Integer> getCount(String str, int index) {
        if (index == str.length()) {
            HashMap<Character, Integer> temp = new HashMap<>();
            return temp;
        }
        HashMap<Character, Integer> map = getCount(str, index + 1);
        char currchar = str.charAt(index);
        if (map.get(currchar) == null) {
             map.put(currchar, 1);
        } 
        else {
            int preValue = map.get(currchar);
            map.put(currchar, preValue + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        String str = "aayush kaushik";
        //System.out.println(str);
        HashMap<Character, Integer> result = getCount(str, 0);
        System.out.println(result);
    }
}
