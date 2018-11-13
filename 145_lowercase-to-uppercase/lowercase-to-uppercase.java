/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/lowercase-to-uppercase
@Language: Java
@Datetime: 16-03-29 01:56
*/

public class Solution {
    /**
     * @param character a character
     * @return a character
     */
    public char lowercaseToUppercase(char character) {
        // Write your code here
        
        if( character >= 'a' && character <='z'){
          
           return (char)(character - 32) ;
        }
        else {
            return character;
        }
    }
}