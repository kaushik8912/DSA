package Recursion;

import java.util.ArrayList;

public class DiceCount {
    static ArrayList<String> countWays(int Source,int Target){
        if(Source==Target){
            ArrayList<String> list=  new ArrayList<>();
            list.add("");
            return list;
        }
        if (Source>Target){
            ArrayList<String> list= new ArrayList<>();
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        for(int dice=1;dice<=6;dice++){
            int current = Source+dice;
            ArrayList<String> list= countWays(current, Target);
            for(String str: list){
                result.add(str + dice);
            
            }
        }
        return result;

        }
    public static void main(String[] args) {
        System.out.println(countWays(0, 100));
    }
    
}
