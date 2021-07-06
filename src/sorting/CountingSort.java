package sorting;

import java.util.Arrays;

public class CountingSort {
    /**
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
    public static void countSortV2(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int[] countingArray = new int[max+1];
        int[] output = new int[arr.length];
        for (int i = 0; i < countingArray.length; i++) {
            countingArray[i]=0;
        }
        for (int i = 0; i < arr.length; i++) {
            ++countingArray[arr[i]];
        }
        for (int i = 1; i < countingArray.length; i++) {
            countingArray[i] = countingArray[i] + countingArray[i-1];
        }

        for (int i = arr.length - 1; i >=0 ; i--) {
            output[countingArray[arr[i]]-1]  = arr[i];
            countingArray[arr[i]]--;
        }

        System.out.println(Arrays.toString(output));
    }
    /*
    Handle negative values
     */
    public static void countSortV3(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        int[] countingArray = new int[max-min+1];
        int[] output = new int[arr.length];
        //Initialize the array
        for (int i = 0; i < countingArray.length; i++) {
            countingArray[i]=0;
        }

        for (int i = 0; i < arr.length; i++) {
            ++countingArray[arr[i]-min]; //to make the minimum index 0 since array arr contains negative values
        }
        for (int i = 1; i < countingArray.length; i++) {
            countingArray[i] = countingArray[i] + countingArray[i-1];
        }

        for (int i = arr.length - 1; i >=0 ; i--) {
            output[countingArray[arr[i]-min]-1]  = arr[i];
            countingArray[arr[i]-min]--;
        }

        System.out.println(Arrays.toString(output));
    }
    public static void main(String[] args) {
        int[] arr = {10,5,2,9,4,10,5,2,11,4,5,9,1,5,9,0};
        countSortV3(arr);
        int[] arrNegative = {-10, -5, -3, -1, 0, 5, 8, 10};
        countSortV3(arrNegative);
    }
}
