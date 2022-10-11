package heap;

import java.util.Arrays;

public class MaxHeap {
    public static void main(String[] args) {
        int[] inputArray = {1, 4, 7, 12, 15, 14, 9, 2, 3, 16};
        System.out.println("Before heapify :"+Arrays.toString(inputArray));
        buildMaxHeap(inputArray);
        System.out.println("After heapify : "+Arrays.toString(inputArray));
    }
    private static void buildMaxHeap(int[] inputArrays){
        int headSize = inputArrays.length;
        for(int i = (headSize-1)/2;i>=0;i--){
            maxHeapify(inputArrays,i,headSize);
        }
    }
    private static void maxHeapify(int[] inputArray,int index, int headSize){
        int largest = index;

        while (largest < headSize/2){

            int left = 2 * index +1;
            int right = 2 * index + 2;

            if(left < headSize && inputArray[index]< inputArray[left]){
                largest = left;
            }
            if(right < headSize && inputArray[largest] < inputArray[right]){
                largest = right;
            }

            if(largest != index){
                int temp = inputArray[index];
                inputArray[index] = inputArray[largest];
                inputArray[largest] = temp;
                index = largest;
            }else{
                break;
            }
        }

    }
}
