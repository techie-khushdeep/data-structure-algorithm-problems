package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    static void mergeSortInPlace(int[] arr,int start,int end){
        if(end-start==1){
           return;
        }
        int mid = (start + end)/2;
        mergeSortInPlace(arr,start,mid);
        mergeSortInPlace(arr,mid,end);
        mergeInPlace(arr,start,mid,end);
    }
    static void mergeInPlace(int[] arr, int start,int mid, int end){
        int[] temp = new int[end - start];

        int k=0;
        int i=start;
        int j=mid;

        while(i<mid && j<end){
            if (arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while (i<mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<end){
            temp[k]=arr[j];
            j++;
            k++;
        }

        //copy the temporary array to main array
        if (temp.length >= 0) System.arraycopy(temp, 0, arr, start, temp.length);
    }

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter no. of element");
//        int N = input.nextInt();
//
//        int[] inputArr = new int[N];
//
//        for (int i = 0; i < inputArr.length; i++) {
//            System.out.println("Array [" + i + "] :");
//            inputArr[i] = input.nextInt();
//        }
//        System.out.println("Output");
//        //divide(inputArr,0,N-1);
        int[] arr = {34,12,89,35};
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

//        int[]result =mergeSort(new int[]{12,3,1,8,11});
//        System.out.println(Arrays.toString(result));
//        for (int j : inputArr) {
//            System.out.println(" " + j);
//        }
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return mergeArray(left,right);
    }

    private static int[] mergeArray(int[] left, int[] right) {
        int[] result = new int[left.length+right.length];
        int i=0,j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                result[k]=left[i];
                i++;
            }else{
                result[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            result[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            result[k]=right[j];
            j++;
            k++;
        }
        return result;
    }
}
