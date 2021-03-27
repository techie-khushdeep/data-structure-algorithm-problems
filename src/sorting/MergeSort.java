package sorting;

import java.util.Scanner;

public class MergeSort {

    static void divide(int[] arr,int start,int end){
        if(start<end){
            int mid = (start + end)/2;
            divide(arr,start,mid);
            divide(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    static void merge(int[] arr, int start,int mid, int end){
        int[] temp = new int[(end - start) + 1];

        int k=0;
        int i=start;
        int j=mid+1;

        while(i<=mid && j<=end){
            if (arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while (i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=end){
            temp[k]=arr[j];
            j++;
            k++;
        }

        //copy the temporary array to main array
        if (temp.length >= 0) System.arraycopy(temp, 0, arr, start, temp.length);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter no. of element");
        int N = input.nextInt();

        int[] inputArr = new int[N];

        for (int i = 0; i < inputArr.length; i++) {
            System.out.println("Array [" + i + "] :");
            inputArr[i] = input.nextInt();
        }
        System.out.println("Output");
        divide(inputArr,0,N-1);

        for (int j : inputArr) {
            System.out.println(" " + j);
        }
    }
}
