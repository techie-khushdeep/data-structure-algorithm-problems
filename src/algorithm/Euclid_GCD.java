package algorithm;

public class Euclid_GCD {
    public static void main(String[] args) {
        int a = 105, b=350;
        System.out.println(GCD(a, b));

    }

    public static int GCD(int a, int b) {
        while( b !=0){
            int reminder = a % b;
            a = b;
            b =reminder;
        }

        return a;
    }
}
