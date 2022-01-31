package number_problem;

public class MagicNumber {
    public static void main(String[] args) {
        int n=6;
        //for eg. if n=1 =>
        int result=0;
        int base = 5;
        while(n>0){
            //get last bit
            int last = n & 1;
            n = n>>1;//left shift
            result += base *last;
            base = base*5;
        }
        System.out.println(result);
    }
}
