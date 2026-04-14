import java.util.*;

public class Balanced_Brackets {
    public static boolean isbalancedBrackets(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{'){
                s.push(ch);
            }else if(ch != ')' && ch != ']' && ch != '}'){
                continue;

            }else{
                if(ch == ')' && s.peek()=='('||
                ch == ']' && s.peek()=='[' ||
                ch == '}' && s.peek()=='{') s.pop();
            }
        }

        return s.isEmpty();
    }
    public static void main(String[] args) {
        String str1 = "{[] ([{}])}";
        String st2 = "([[])";

        System.out.println(isbalancedBrackets(str1));
        System.out.println(isbalancedBrackets(st2));
    }

}