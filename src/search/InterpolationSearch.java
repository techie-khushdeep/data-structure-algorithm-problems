package search;

public class InterpolationSearch {
    public static void main(String[] args) {
        int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21,
                22, 23, 24, 33, 35, 42, 47 };//4th
        System.out.println(search(arr, 0, arr.length - 1, 10));
    }

    //using recursion
    private static int search(int[] arr, int min, int max, int target) {
        int position = -1;
        if (min <= max && target >= arr[min] && target <=arr[max]){
            position = min + ((target - arr[min])*(max - min))/(arr[max] - arr[min]);
            if (arr[position] == target){
                return position;
            }
            if(arr[position]>target){
                return search(arr,min,position-1,target);
            }else{
                return search(arr,position+1, max, target);
            }

        }
            return -1;


    }
}
