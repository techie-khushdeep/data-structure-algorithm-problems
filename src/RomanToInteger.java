//Solution: https://leetcode.com/problems/roman-to-integer/

class RomanToInteger {
    public static void main(String[] args) {
        romanToInt("LVIII");
    }
    public static int romanToInt(String s) {
        
        int lastValue=0;
        int currentValue=0;
        int sum=0;
        
        for(char ch:s.toCharArray()){
            currentValue = symbolToValue(ch);
            if(currentValue<lastValue){
                sum +=currentValue - lastValue;
            }else{
                sum +=currentValue;
            }
            lastValue= currentValue;
        }
        return sum;
        
    }
    public static int symbolToValue(char ch){
        int result=0;
        switch(ch){
            case 'I':
                result=1;
                break;
            case 'V':
                result = 5;
                break;
            case 'X':
                result =10;
                break;
            case 'L':
                result = 50;
                break;
            case 'C':
                result = 100;
                break;
            case 'D':
                result = 500;
                break;
            case 'M':
                result = 1000;
                break;
        }
        return result;
    }
}