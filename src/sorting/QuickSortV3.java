package sorting;

import java.util.Arrays;
import java.util.Random;

// quick sort using random pivot
public class QuickSortV3 {
    private void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args){
        QuickSortV3 obj = new QuickSortV3();
        int arr[] = {5,4,1,0,5,95,4,-100,200,0};
        System.out.println("Before : "+ Arrays.toString(arr));
        obj.quickSort(arr,0,arr.length-1);
        System.out.println("After quick sort :"+Arrays.toString(arr));
    }

    private void quickSort(int[] arr, int left, int right){
        if(left < right){
            int pivot = partition(arr,left, right);
            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }

    }
    private int partition(int[] arr, int left, int right){
        int pi = choosePivotIndex(left, right);
        swap(arr,pi,right);
        int pivot = arr[right];

        //keep track place for pivot
        int i = left-1;
        for(int j=left;j<right;j++){
            if(arr[j]<=pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,right);
        return i+1;
    }

    private int choosePivotIndex(int left, int right) {
        Random rand = new Random();
        int index1 = left + rand.nextInt(right - left +1);
        int index2 = left + rand.nextInt(right - left +1);
        int index3 = left + rand.nextInt(right - left +1);

        // Return their median
        int pi = Math.max(Math.min(index1,index2), Math.min(Math.max(index1,index2), index3));
        return pi;
    }
}
