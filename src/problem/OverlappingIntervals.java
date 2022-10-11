package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//leet code : https://leetcode.com/problems/non-overlapping-intervals/
//problem : 435
public class OverlappingIntervals {
    public static void main(String[] args) {
       int[][] input = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(solution(input));
    }

    private static int solution(int[][] intervals){
        if(intervals.length==0){
            return 0;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int end = intervals[0][1], prev = 0, count = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[prev][1] > intervals[i][0]) {
                if (intervals[prev][1] > intervals[i][1]) {
                    prev = i;
                }
                count++;
            } else {
                prev = i;
            }
        }
        return count;
    }
}
