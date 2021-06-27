package sorting;

import java.util.Arrays;

public class CountingSort {
    /*
    Best suited where array max value is less than array length
    contains all positive no.
    --Need to check the this implementation is stable sort or not
     */
    public static void countSortV1(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int[] countingArray = new int[max+1];

        for (int i = 0; i <= max; i++) {
            countingArray[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            ++countingArray[arr[i]];
        }

        int index=0;
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < countingArray[i]; j++) {
                arr[index]= i;
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {10,5,2,9,4,10,5,2,11,4,5,9,1,5,9,0};
        countSortV1(arr);
    }
}
