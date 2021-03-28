package sorting;

import java.util.Scanner;

public class BubbleSort {

    private static void bubbleSort(int[] arr){
        int temp;
       // Instant startTime = Instant.now();
        boolean isSwapped;
        for (int i = 0; i < arr.length; i++) {
            isSwapped=false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    isSwapped=true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
//        Instant endTime = Instant.now();
//        Duration interval = Duration.between(startTime,endTime);
//        System.out.println("Time in  seconds : "+interval.getNano());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter no of element");
        int N = input.nextInt();
        int[] inputArr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Array["+i+"] :");
            inputArr[i] = input.nextInt();
        }

        bubbleSort(inputArr);

        System.out.println("Output");
        for (int value:inputArr) System.out.println(value);
    }
}
