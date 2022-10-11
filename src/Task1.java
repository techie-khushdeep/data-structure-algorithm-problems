import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String[] A = {"CC0","AB0",};
        int[] B = {12,12};
        System.out.println(solution(A,B));

    }
    public static String solution(String[] A, int[] B){
        Map<String,Integer> map = new HashMap<>();

        String maxInvestmentCountry="";
        int maxValue=0;

        for(int i=0;i<A.length;i++) {
            String country = A[i].substring(0, 2);
            int val;
            if (map.containsKey(country)) {
                val = map.get(country);
                val += B[i];

            } else {
                val = B[i];
            }
            map.put(country, val);
            if (val > maxValue) {
                maxValue = val;
                maxInvestmentCountry = country;
            }
        }
        return maxInvestmentCountry;
    }
}
