package recursion;

import java.util.Arrays;

public class PatternWithRecursion {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        selectionSort(arr, arr.length,1,0 );
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr,int r, int c,int maxIndex){
        if(r==0){
            return;
        }
        if(c<r){
            //System.out.print(" * ");
            if(arr[c]>arr[maxIndex]){
               maxIndex=c;
            }
            selectionSort(arr,r,c+1,maxIndex);

        }else{


                int temp = arr[r-1];
                arr[r-1]= arr[maxIndex];
                arr[maxIndex]=temp;

            selectionSort(arr,r-1,1,0);
        }
    }
    public static void bubbleSortUpd(int[] arr,int r, int c,boolean isSorted){
        if(r==0){
            return;
        }
        if(c<r){
            //System.out.print(" * ");
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c]= arr[c+1];
                arr[c+1] = temp;
                isSorted=false;
            }
            bubbleSortUpd(arr,r,c+1,isSorted);

        }else{

            //System.out.println();
            if(isSorted){
                return;
            }
            bubbleSortUpd(arr,r-1,0,true);
        }
    }
    public static void bubbleSort(int[] arr,int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            //System.out.print(" * ");
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c]= arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr,r,c+1);

        }else{

            //System.out.println();
            bubbleSort(arr,r-1,0);
        }
    }
    public static void reversePattern(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print(" * ");
            reversePattern(r,c+1);

        }else{

            System.out.println();
            reversePattern(r-1,0);
        }
    }
    public static void pattern(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){

            reversePattern(r,c+1);
            System.out.print(" * ");

        }else{
            reversePattern(r-1,0);
            System.out.println();

        }
    }

}
