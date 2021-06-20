package algorithm;

import java.util.Arrays;

/*
One value that isn't as easy to calculate is the median,
the value that lies in the middle of the values when they are sorted
 */
public class Median {
    public static void main(String[] args) {
        int[] input = {3,1,7,8,4,8,9} ;//median 7
        int[] input1 = {1,4,6,9};
        //System.out.println(calMedian_approch1(input));
        System.out.println(calMedian_approach2(input1));
    }
    public static int calMedian_approach2(int[] input){
        int[] inp = input.clone();
        Arrays.sort(inp);
        if (inp.length %2 ==0){
            int index = (int)(inp.length/2);
            return (inp[index-1]+inp[index])/2;
        }else{
            int index = (int)(inp.length+1)/2;
            return inp[index-1]; //array always starts from zero's index
        }
    }
    public static int calMedian_approach1(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int less_numbers = 0;
            int greater_numbers=0;
            for (int j = 0; j < input.length; j++) {
                if(input[j]> input[i]){
                    greater_numbers++;
                }else if (input[j]< input[i]){
                    less_numbers++;
                }
            }
            if (greater_numbers == less_numbers){
                return input[i];
            }
        }
        return -1;
    }
}
