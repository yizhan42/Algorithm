/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/copy-books
@Language: Java
@Datetime: 17-02-24 11:28
*/

public class Solution {
    /**
     * @param pages: an array of integers
     * @param k: an integer
     * @return: an integer
     */
    public int copyBooks(int[] pages, int k) {
        // write your code here
        if (pages.length == 0) {
            return 0;  
        }
        
        int total = 0;
        int max = pages[0];
        for (int i = 0; i < pages.length; i++) {
            total += pages[i];
            if (max < pages[i]) {
                max = pages[i];
            }
        }
        
        int start = max;
        int end = total;
        
        while (start + 1 < end) {
            int mid = (end - start) / 2 + start;
            if (countCopiers(pages, mid) > k) {
                start = mid;
            } else {
                end = mid;
            }
        }
        
        if (countCopiers(pages, start) <= k) {
            return start;
        }
        
        return end;
    }
    
    private int countCopiers(int[] pages, int limit) {
        if (pages.length == 0) {
            return 0;
        }
        
        int copiers = 1;
        int sum = pages[0]; // limit is always >= pages[0]
        for (int i = 1; i < pages.length; i++) {
            if (sum + pages[i] > limit) {
                copiers++;
                sum = 0;
            }
            sum += pages[i];
        }
        
        return copiers;
    
    }
}

/*
// version 2: Dynamic Programming

public class Solution {
    
     // * @param pages: an array of integers
     //* @param k: an integer
     //* @return: an integer
     
    int [][]init(int []A)  
    {  
        int n = A.length;
        int [][]w = new int [n+2][n+2];
        for(int i = 1; i <= n; i++) {  
            for(int j = i+1; j <= n; j++)  
            {  
                for(int k = i;k <= j;++k) {
                    w[i][j] += A[k - 1];  
                }
            } 
        }
        return w; 
    } 
    
    public int copyBooks(int[] pages, int k) {
        // write your code here
        int n = pages.length;
        int [][]w = init(pages);
        int [][]dp = new int[n + 2][k + 2];
        int [][]s = new int[n + 2][k + 2];
        
        int ans = Integer.MIN_VALUE;
        if(n <= k) {
            for(int i = 0; i < n; i++) 
             ans = Math.max(ans, pages[i]);
            return ans;
        }
        
        for(int i = 0;i <= n;++i)  {
            dp[i][1] = w[1][i];
            
        }
        
        for(int nk = 2; nk <= k; nk++) {
            
            for(int i = nk; i <= n; i++) {
                dp[i][nk] = Integer.MAX_VALUE;
                for(int j = 0; j < i; j++) {  
                    if(dp[i][nk] == Integer.MAX_VALUE || dp[i][nk] > Math.max(dp[j][nk-1], w[j+1][i]))  
                        dp[i][nk] = Math.max(dp[j][nk-1], w[j+1][i]);   
                }  
            }
        }
        return dp[n][k];
    }
}
**/