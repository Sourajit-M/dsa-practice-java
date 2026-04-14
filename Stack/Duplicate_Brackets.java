import java.util.*;

public class Duplicate_Brackets{
    public static boolean hasDuplicateBrackets(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ')'){
                s.push(ch);
            }else{
                if(s.peek() == '(') return true;
                else{
                    while(!s.isEmpty() && s.peek()!='('){
                        s.pop();
                    }

                    s.pop();
                }
            }

        }

        return false;
    }
    public static void main(String[] args){
        String str1 = "((a+b) + (c+d))";
        String str2 = "((a+b)) + (c+d)";

        System.out.println(hasDuplicateBrackets(str1));
        System.out.println(hasDuplicateBrackets(str2));
    }
}