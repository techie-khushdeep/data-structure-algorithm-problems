package array;

import algorithm.Euclid_GCD;

import java.util.Arrays;
import java.util.Scanner;

public class RotationArray {
    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void simpleApproach(int[] input,int d){
        for (int NumberOfInteration = 1; NumberOfInteration <=d; NumberOfInteration++) {
            int value = input[0];
            for (int movePosition = 1; movePosition <input.length ; movePosition++) {
                input[movePosition-1] = input[movePosition];
            }
            input[input.length-1] = value;
        }
        printArray(input);
    }
    public static void jugglingAlgorithm(int[] input, int d){
        d = d%(input.length);
        int gcd = Euclid_GCD.GCD(input.length,d);
        for (int set = 0; set <gcd ; set++) {
            int temp = input[set];
            int k = set;
            while (true){
                int position = (d+k)%(input.length);
                if (position==set){
                    input[position]= temp;
                    break;
                }else{
                    input[k] = input[position];
                }
                k = position;
            }
        }
        printArray(input);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        printArray(arr);
       // simpleApproach(arr,d);
        jugglingAlgorithm(arr,d);

    }
}
