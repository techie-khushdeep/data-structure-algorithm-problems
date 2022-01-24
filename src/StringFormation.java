import java.util.Arrays;

public class StringFormation {
    public static void main(String[] args) {
        StringFormation obj = new StringFormation();
        System.out.println(Arrays.toString(obj.divideString("abcdefghij", 3, 'x')));
    }
    public String[] divideString(String s, int k, char fill) {

        int length = s.length();

        int arraySize =(int) Math.ceil((length*1.0)/k);
        String[] str = new String[arraySize];

        for(int i=0;i<s.length();i++){
            int val = (int)Math.ceil(i/k);
            if(str[val] == null){
                str[val] = "";
            }
            str[val] += s.charAt(i);
        }
        for(int i=str[arraySize-1].length();i<k;i++){
            str[arraySize-1] += fill;
        }

        return str;


    }
}
