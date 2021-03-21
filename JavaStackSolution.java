import java.util.*;
import java.lang.Character;

public class JavaStackSolution{
    
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            Stack <Character> stack = new Stack <Character>();
            char[] chArr = input.toCharArray();
            for(char c: chArr){
                if (c == '{' || c == '[' || c == '('){
                    stack.push((Character)c);
                }
                else if(!stack.empty() && (c == '}') && (stack.peek().equals((Character) '{'))){
                    stack.pop();
                }
                else if(!stack.empty() && (c == ']') && (stack.peek().equals((Character) '['))){
                    stack.pop();
                }
                else if(!stack.empty() && (c == ')') && (stack.peek().equals((Character) '('))){
                    stack.pop();
                }
                else {
                    stack.push((Character)c);
                }
            }
            if(stack.size()>0){
                System.out.println("false");
            }
            else if(stack.size()==0){
                System.out.println("true");
            }
        }
        
    }
}
