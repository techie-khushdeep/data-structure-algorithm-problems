package number_problem;

public class NoOfDigit {
    public static void main(String[] args) {
        int val = 6;
        int base =2;
        int result = (int)(Math.log(6)/Math.log(base))+1;
        System.out.println(result);
    }
}
