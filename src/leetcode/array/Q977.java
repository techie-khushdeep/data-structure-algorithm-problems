package leetcode.array;

import java.util.Arrays;

//square of sorted array with two pointer approach
// space o(n)
// time o(n);
//https://leetcode.com/problems/squares-of-a-sorted-array/
public class Q977 {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for(int i=n-1;i>=0;i--){
            int square;
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                square = nums[left];
                left++;
            }else{
                square = nums[right];
                right--;
            }
            result[i]= square * square;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int[] result = sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
}
