package string;

import java.util.ArrayList;
import java.util.List;

public class SubSetArray {
    public static void main(String[] args) {
        System.out.println(arraySubSet(new int[]{1,2,3}));
    }
    public static List<List<Integer>> arraySubSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int val : arr){
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(val);
                outer.add(internal);
            }
        }

        return outer;
    }
}
