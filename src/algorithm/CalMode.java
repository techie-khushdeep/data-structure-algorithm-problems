package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
To calculate the mode
 */
public class CalMode {
    public static void main(String[] args) {
        char[] input = {'A','C','A','B','E','B','C','F','B','G'};
        modeApproach1(input);
        modeApproach2(input);
        modeApproach3(input);
    }
    public static void modeApproach1(char[] input) {
        int start_index=-1;
        int max_count=0;

        //Traverse all the elements
        for (int i = 0; i < input.length; i++) {
            int count=1;
            for (int j = i+1; j < input.length; j++) {
                if(input[i]== input[j]){
                    count++;
                }
            }
            if (count>max_count){
                start_index=i;
                max_count = count;
            }
        }
        System.out.println(input[start_index]+" "+max_count);
    }
    public static void modeApproach2(char[] input){
        int max_start_index=-1;
        int max_count=0;
        int count=0;
        int start_index=0;

        char[] values = input.clone();
        Arrays.sort(values);
        char current_value = values[0];

        for (int i = 1; i < values.length; i++) {
            if(values[i]!=current_value){
                count = i-start_index;
                if(count>max_count){
                    max_count = count;
                    max_start_index = start_index;
                }
                start_index=i;
                current_value = values[i];
            }
        }
        count = values.length - start_index;
        if(count>max_count){
            max_count = count;
            max_start_index = start_index;
        }
        System.out.println(values[max_start_index]+" "+max_count);
    }
    public static void modeApproach3(char[] input){
        Map<Character,Integer> map = new HashMap<>();
        char bestValue = ' ';
        int bestCount=0;
        for (int i = 0; i < input.length; i++) {
            if (map.containsKey(input[i])){
                int count = map.get(input[i]);
                count++;
                map.put(input[i],count);
                if (count>bestCount){
                    bestCount=count;
                    bestValue = input[i];
                }
            }else{
                map.put(input[i],1);
            }
        }
        System.out.println(bestValue+" "+bestCount);
    }
}
