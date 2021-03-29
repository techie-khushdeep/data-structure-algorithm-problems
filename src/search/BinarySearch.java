package search;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Size of elements");
        int N = input.nextInt();

        int[] inputArr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Array["+i+"] :");
            inputArr[i]= input.nextInt();
        }

        System.out.println("Enter the element which you want to search:");
        int searchElement = input.nextInt();
        System.out.println("Output");
        System.out.println("index : "+ binarySearch(inputArr,searchElement));
    }

    private static int binarySearch(int[] inputArr, int searchElement) {

        int first=0;
        int last = inputArr.length - 1;

        while(first<=last){
            int mid = (first + last)/2;
            if(searchElement==inputArr[mid]){
                return mid;
            }
            if(searchElement< inputArr[mid]){
                last = mid-1;
            }else{
                first = mid + 1;
            }
        }
        return -1;
    }
}
