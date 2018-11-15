/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/pass-interview
@Language: Java
@Datetime: 16-03-08 10:51
*/

public class Solution {
    /**
     * @param sex the sex of a candidate
     * @param score the interview score of a candidate
     * @return a boolean
     */
    public boolean passInterview(boolean sex, double score) {
        // Write your code here
        if ((sex == true && score >= 3 ) || (sex == false && score >=4))
        return true;
         else
    return false;
}

}