/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/first-bad-version
@Language: Java
@Datetime: 16-12-19 11:51
*/

/**
 * public class SVNRepo {
 *     public static boolean isBadVersion(int k);
 * }
 * you can use SVNRepo.isBadVersion(k) to judge whether 
 * the kth code version is bad or not.
*/
class Solution {
    /**
     * @param n: An integers.
     * @return: An integer which is the first bad version.
     */
    public int findFirstBadVersion(int n) {
        // write your code here
        /*
        int i = 1;
       
        while(i < n){
             int mid = (n + i) / 2;
            if(SVNRepo.isBadVersion(mid) == true){
               n = mid;    
            }else{
                i = mid;
            }    
        }
        if(SVNRepo.isBadVersion(i) == true){
            return i;
        }
            return n;
       */
         int start = 1, end = n;
         while(start + 1 < end){
             int mid = (end + start) / 2;
             if(SVNRepo.isBadVersion(mid) == true){
                 end = mid;
             }else{
                 start = mid;
             }
         }
         if(SVNRepo.isBadVersion(start) == true){
             return start;
         }
         return end;
    }
}
