package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSubSet {
    public static void main(String[] args) {
        System.out.println(subSet("","abc"));
    }
    public static List<String> subSet(String process, String update){
        List<String> result = new ArrayList<>();
        if(update.length()==0){
            if(!process.isEmpty()){
                result.add(process.toString());
            }

            return result;
        }
       // result.add(process.toString()+update.charAt(0));
       // result.add(process.toString());
        //ignore the character
       result.addAll(subSet(process,update.substring(1)));
        result.addAll(subSet(process +(update.charAt(0)),update.substring(1)));
        return result;
    }
}
