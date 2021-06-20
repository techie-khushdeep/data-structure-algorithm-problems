package algorithm;

import java.util.Arrays;

/*
To calculate the mode
 */
public class CalMode {
    public static void main(String[] args) {
        char[] input = {'A','C','A','B','E','B','C','F','B','G'};
        modeApproach2(input);
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
        int count =1;
        int start_index=0;

        char[] values = input.clone();
        Arrays.sort(values);

        for (int i = 1; i < input.length; i++) {
            if(values[start_index]==values[i]){
                count++;
            }else{
                if(count>max_count){
                    max_count = count;
                    count=1;
                    max_start_index = start_index;
                    start_index=i;
                }
            }
        }
        if(count>max_count){
            max_count = count;
            max_start_index = start_index;
        }
        System.out.println(values[max_start_index]+" "+max_count);
    }
}
