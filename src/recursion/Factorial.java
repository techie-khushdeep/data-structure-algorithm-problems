package recursion;

public class Factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(print(n));
    }
    public static int print(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*print(n-1);
    }
}
