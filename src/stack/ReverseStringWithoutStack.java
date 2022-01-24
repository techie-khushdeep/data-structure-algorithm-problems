package stack;

public class ReverseStringWithoutStack {
    public static void main(String[] args){
        StringBuilder st = new StringBuilder("ziuQskeeG");
        for(int i=0;i<st.length()/2;i++){
            swap(st,i,st.length()-i-1);
        }
        System.out.println(st);
    }
    public static void swap(StringBuilder st,int index1,int index2){
        char temp = st.charAt(index1);
        st.setCharAt(index1,st.charAt(index2));
        st.setCharAt(index2,temp);
    }
}
