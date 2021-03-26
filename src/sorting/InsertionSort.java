package sorting;

import java.util.Scanner;

public class InsertionSort {
    static void sort(int[] inputArray,int N){
        for (int i=1;i<N;i++){
            int value = inputArray[i];
            int index = i;
            while(index>0 && inputArray[index-1]>value){
                inputArray[index]=inputArray[index-1];
                index--;
            }
            inputArray[index]=value;

        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of element[int]");
        int N = input.nextInt();
        int[] inputArray = new int[N];
        for (int i=0;i<N;i++){
            System.out.print("Array["+i+"] = ");
            inputArray[i]= input.nextInt();
        }
        System.out.println("Output:");
        sort(inputArray,N);
        for (int i = 0; i < N; i++) {
            System.out.print(" "+inputArray[i]);
        }
    }
}
