package Recursion;

import java.util.HashMap;

public class FreqCount {
 static HashMap<Character, Integer> getCount(String str,int index,int length){

    if(index==length){
        HashMap<Character,Integer>map = new HashMap<>();
        return map;
    }
    HashMap<Character, Integer> map = getCount(str, index+1,length);
    char singleChar = str.charAt(index);
    if(map.get(singleChar)==null){
        map.put(singleChar, 1);
    }
    else{
        int count = map.get(singleChar);
        map.put(singleChar, count+1);
        }
    return map;

 }

    public static void main(String[] args) {
        String str = "ram sharma";
        HashMap<Character,Integer>result= getCount(str, 0, str.length());
        System.out.println(result);
    }

}