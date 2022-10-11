package problem;

import java.util.Arrays;

public class ProductOfAllElementExceptItSelf {
    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        System.out.println("Input arrays : "+Arrays.toString(input));
        System.out.println(Arrays.toString(solution(input)));
    }

    private static int[] solution(int[] input){
        int[] result = new int[input.length];

        int temp = 1;
        for (int i = 0; i < input.length; i++) {
            result[i] = temp;
            temp *= input[i];
        }

        temp = 1;
        for (int i = input.length-1; i >=0 ; i--) {
            result[i] *= temp;
            temp *= input[i];
        }

        System.out.println(Arrays.toString(result));

        return result;
    }
}
