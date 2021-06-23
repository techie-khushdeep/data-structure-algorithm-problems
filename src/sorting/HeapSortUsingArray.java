package sorting;

import java.util.Arrays;

public class HeapSortUsingArray {
    public static void printHeap(int[] input){
        System.out.println(Arrays.toString(input));
    }
    public static void heapSort(int[] input){
        heap(input);
        for (int i = input.length-1; i >=0 ; i--) {
            removeItem(input,i);
        }
        printHeap(input);
    }
    public static void removeItem(int[] input,int lastItemIndex){
        int count = lastItemIndex-1;
        int temp= input[0];
        input[0]=input[lastItemIndex];
        input[lastItemIndex]=temp;
        int index=0;
        while (true){
            int child1 = 2*index +1;
            int child2 = 2*index +2;
            if(child1>count){
                child1= index;
            }
            if(child2>count){
                child2 = index;
            }
            if(input[child1]<=input[index] && input[child2]<=input[index]){
                break;
            }
            int child;
            if(input[child1] > input[child2]){
                child = child1;
            }else{
                child= child2;
            }
            temp = input[child];
            input[child]=input[index];
            input[index]=temp;
            index = child;
        }
    }
    public static void heap(int[] input){
        for (int i = 0; i < input.length; i++) {
            int index = i;
            while(index != 0){
                int parent = (index-1)/2;
                if(input[index] <=input[parent]){
                    break;
                }
                int temp = input[parent];
                input[parent]=input[index];
                input[index] = temp;
                index = parent;
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {7,1,10,4,6,9,2,11,3,5,12,8};
        //heap(input);
        //printHeap(input);
        heapSort(input);
    }
}
