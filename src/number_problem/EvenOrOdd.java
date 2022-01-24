package number_problem;
//using bitwise
public class EvenOrOdd {
    public static void main(String[] args) {
        int a= 17;
        if((a &1)==1){//first a will be converted into binary and then and operation will happen
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }
}
