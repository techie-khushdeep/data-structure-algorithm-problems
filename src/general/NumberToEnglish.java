package general;

import java.util.HashMap;
import java.util.Map;

public class NumberToEnglish {
    Map<Integer, String> numberToWordMap;
    public static void main(String[] args) {
        System.out.println(new NumberToEnglish().solution(1100));
    }
    private String solution(int num){
        if(num==0){
            return "Zero";
        }

        numberToWordMap = new HashMap<>();

        numberToWordMap.put(1,"One");
        numberToWordMap.put(2,"Two");
        numberToWordMap.put(3,"Three");
        numberToWordMap.put(4,"Four");
        numberToWordMap.put(5,"Five");
        numberToWordMap.put(6,"Six");
        numberToWordMap.put(7,"Seven");
        numberToWordMap.put(8,"Eight");
        numberToWordMap.put(9,"Nine");

        numberToWordMap.put(10,"Ten");
        numberToWordMap.put(11,"Eleven");
        numberToWordMap.put(12,"Twelve");
        numberToWordMap.put(13,"Thirteen");
        numberToWordMap.put(14,"Fourteen");
        numberToWordMap.put(15,"Fifteen");
        numberToWordMap.put(16,"Sixteen");
        numberToWordMap.put(17,"Seventeen");
        numberToWordMap.put(18,"Eighteen");
        numberToWordMap.put(19,"Nineteen");
        numberToWordMap.put(20,"Twenty");

        numberToWordMap.put(30,"Thirty");
        numberToWordMap.put(40,"Forty");
        numberToWordMap.put(50,"Fifty");
        numberToWordMap.put(60,"Sixty");
        numberToWordMap.put(70,"Seventy");
        numberToWordMap.put(80,"Eighty");
        numberToWordMap.put(90,"Ninety");
        numberToWordMap.put(100,"Hundred");

        numberToWordMap.put(1000,"Thousand");

        numberToWordMap.put(1000000,"Million");

        numberToWordMap.put(1000000000,"Billion");



        return helper(num).trim();
    }
    private String helper(int num ){
        String result = "";
        int div=0;
        int remainder = 0;
        if(num==0){
            return result;
        }

        if(num>= 1000000000){
            div = num /1000000000;
            result += helper(div);
            result += " " + numberToWordMap.get(1000000000);
            remainder = num % 1000000000;
            result += helper(remainder);
        }
        else if(num >= 1000000 ){
            div = num /1000000;
            result += helper(div);
            result += " " + numberToWordMap.get(1000000);
            remainder = num % 1000000;
            result += helper(remainder);
        }
        else if(num >= 1000){
            div = num /1000;
            result += helper(div);
            result += " " + numberToWordMap.get(1000);
            remainder = num % 1000;
            result += helper(remainder);
        }
        else if(num >= 100){
            div = num /100;
            result += helper(div);
            result += " " + numberToWordMap.get(100);
            remainder = num % 100;
            result += helper(remainder);
        }
        else if(num >= 90){
            result += " " + numberToWordMap.get(90);
            remainder = num % 90;
            result += helper(remainder);
        }
        else if(num >= 80){
            result += " " + numberToWordMap.get(80);
            remainder = num % 80;
            result += helper(remainder);
        }
        else if(num >= 70){
            result += " " + numberToWordMap.get(70);
            remainder = num % 70;
            result += helper(remainder);
        }
        else if(num >= 60){
            result += " " + numberToWordMap.get(60);
            remainder = num % 60;
            result += helper(remainder);
        }else if(num >= 50){
            result += " " + numberToWordMap.get(50);
            remainder = num % 50;
            result += helper(remainder);
        }else if(num >= 40){
            result += " " + numberToWordMap.get(40);
            remainder = num % 40;
            result += helper(remainder);
        }else if(num >= 30){
            result += " " + numberToWordMap.get(30);
            remainder = num % 30;
            result += helper(remainder);
        }else if(num >= 20){
            result += " " + numberToWordMap.get(20);
            remainder = num % 20;
            result += helper(remainder);
        }else{
            result += " " + numberToWordMap.get(num);
            remainder = num % num;
            result += helper(remainder);
        }

        return result;
    }
}
