package sorting;

import javax.script.ScriptContext;
import java.util.Scanner;
public class SelectionSort {

    private static int minIndex(int[] arr,int start,int end){
        int minIndex = start;
        for (int i = start+1; i <=end ; i++) {
            if(arr[i]<arr[minIndex]){
                minIndex=i;
            }
        }
        return  minIndex;
    }

    private static void selectionSort(int[] arr, int start,int end){
        int temp;
        for (int i = start; i <=end; i++) {
            int minIndex = minIndex(arr,i,end);
            if(minIndex !=i){
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of element");
        int N = input.nextInt();

        int[] inputArr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Array["+"] :");
            inputArr[i] = input.nextInt();
        }
        selectionSort(inputArr,0,N-1);
        System.out.println("Output");
        for (int value: inputArr) {
            System.out.println(value);
        }
    }
}
