package recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(12345));
    }
    public static int sumOfDigit(int n){
        if(n==0){
            return 0;
        }
        int lastDigit = n%10;
        return lastDigit +sumOfDigit(n/10);
    }
}
