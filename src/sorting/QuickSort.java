package sorting;

import java.util.Scanner;

public class QuickSort {

    private static void quickSort(int[] arr,int start,int end){
        if (start<end) {
            int pivot_index = partition(arr, start, end);
            quickSort(arr, start, pivot_index - 1);
            quickSort(arr, pivot_index + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot_value = arr[end];
        int pivot_index=start;
        int temp;
        for (int i = start; i <end ; i++) {
            if(arr[i]<=pivot_value){
                temp = arr[pivot_index];
                arr[pivot_index]=arr[i];
                arr[i]=temp;
                pivot_index++;
            }
        }
        temp = arr[pivot_index];
        arr[pivot_index] = arr[end];
        arr[end]= temp;
        return pivot_index;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter element no.");
        int N = input.nextInt();

        int[] inputArr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Array["+i+"] :");
            inputArr[i] = input.nextInt();
        }

        System.out.println("Output");
        quickSort(inputArr,0,N-1);
        for (int j : inputArr) {
            System.out.println(j);
        }
    }
}
