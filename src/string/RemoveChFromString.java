package string;

public class RemoveChFromString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("baccad");
        StringBuilder processing = new StringBuilder();
        char ch = 'a';

       // skipStringWithIteration(sb, ch);
       // skip(processing,sb);
        System.out.println(skip(sb));

    }

    private static void skipStringWithIteration(StringBuilder sb, char ch) {
        for(int i = 0; i< sb.length(); i++){
            if(sb.charAt(i)== ch){
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb);
    }

    private static void skip(StringBuilder processing, StringBuilder updating){
        if(updating.length()==0){
            System.out.println(processing);
            return;
        }
        if(updating.charAt(0)=='a'){
            skip(processing,updating.deleteCharAt(0));
        }else{
            processing.append(updating.charAt(0));
            skip(processing,updating.deleteCharAt(0));
        }


    }
    public static StringBuilder skip(StringBuilder str){
        StringBuilder result = new StringBuilder();
        if(str.length()==0){
            return result;
        }
        if(str.charAt(0)=='a'){
            return result.append(skip(str.deleteCharAt(0)));
        }else{
            result.append(str.charAt(0));
            return result.append(skip(str.deleteCharAt(0)));
        }
    }

}
