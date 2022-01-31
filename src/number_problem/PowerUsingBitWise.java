package number_problem;

public class PowerUsingBitWise {
    public static void main(String[] args) {
        int power = 6;
        int base = 3;
        int ans = 1;
        while(power > 0){

            if((power & 1)==1){
                ans *= base;
            }
            power = power >> 1;

            base *=base;
        }
        System.out.println(ans);

    }
}
