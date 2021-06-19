package algorithm;
//To calculate exponential
public class CalcExponential {
    public static void main(String[] args) {
       int factor=10,expo=3;
        int result = 1;
       while (expo!=0){
           if(expo % 2 == 1){
               result *= factor;
           }
           expo /= 2;
           factor *= factor;
       }
        System.out.println(result);
    }
}
