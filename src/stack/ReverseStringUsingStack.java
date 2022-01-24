package stack;

import java.util.ArrayDeque;

public class ReverseStringUsingStack {
    public static void main(String[] args){
        ArrayDeque<Character> input = new ArrayDeque<>();
        String str = "ziuQskeeG";
        for(byte index=0;index<str.length();index++){
            input.push(str.charAt(index));
        }
        StringBuilder st = new StringBuilder();
        while(input.peek()!=null){

            st.append(input.pop());
        }
        System.out.println(st);
    }
}
