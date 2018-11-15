/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/valid-parentheses
@Language: Java
@Datetime: 16-11-01 13:48
*/

public class Solution {
    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // Write your code here
         Stack<Character> stack = new Stack<Character>();
         for(int i = 0;i < s.length(); ++i){
             char ch = s.charAt(i);
             if('['==ch || '{'==ch || '('==ch){
                 stack.push(ch);
             }else if(stack.isEmpty() ){
                 return false;
             }else if((']'==ch && stack.peek() !='[')
             ||('}'==ch &&stack.peek() !='{')
             ||(')'==ch && stack.peek() !='(')){
                 return false;
             }else
            { stack.pop();}
         }
         return stack.isEmpty();
    }
}