/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/lowercase-to-uppercase-ii
@Language: Java
@Datetime: 16-03-29 04:19
*/

public class Solution {
    /**
     * @param str a string
     * @return a string
     */
 
        public String lowercaseToUppercase2(String str) {
        // Write your code here
        StringBuilder sb = new StringBuilder(str);
        for (int index = 0; index < sb.length(); index++) {
            char c = sb.charAt(index);
            if (Character.isLowerCase(c)) {
                sb.setCharAt(index, Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
    
}