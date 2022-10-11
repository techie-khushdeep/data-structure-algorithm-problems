package heap;

import java.util.Arrays;

public class MinHeap {
    public static void main(String[] args) {
        int[] inputArray = {16, 15, 14, 12, 4, 7, 9, 2, 3, 1};
        System.out.println("Before heapify :"+ Arrays.toString(inputArray));
        buildMinHeap(inputArray);
        System.out.println("After heapify : "+Arrays.toString(inputArray));
    }
    private static void buildMinHeap(int[] inputArray){
        int heapSize = inputArray.length;
        for(int i= (heapSize-1)/2; i>=0;i--){
            minHeapify(inputArray,i,heapSize);
        }
    }
    private static void minHeapify(int[] inputArray,int index, int heapSize){
        int min = index;
        while(min <heapSize/2){
            int left = 2 * index + 1;
            int right = 2 * index + 2;

            if(left < heapSize && inputArray[left]< inputArray[index]){
                min = left;
            }
            if(right < heapSize && inputArray[right] < inputArray[min]){
                min = right;
            }

            if(min != index){
                int temp = inputArray[min];
                inputArray[min] = inputArray[index];
                inputArray[index] = temp;
                index = min;
            }else{
                break;
            }
        }
    }
}
