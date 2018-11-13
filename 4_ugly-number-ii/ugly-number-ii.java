/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/ugly-number-ii
@Language: Java
@Datetime: 17-02-25 15:44
*/

// version 1: O(n) scan

class Solution {
    /**
     * @param n an integer
     * @return the nth prime number as description.
     */
    public int nthUglyNumber(int n) {
        // Write your code here
         List<Integer> uglys = new ArrayList<Integer>();
        uglys.add(1);
        
        int p2 = 0, p3 = 0, p5 = 0;
        // p2, p3 & p5 share the same queue: uglys

        for (int i = 1; i < n; i++) {
            int lastNumber = uglys.get(i - 1);
            while (uglys.get(p2) * 2 <= lastNumber) p2++;
            while (uglys.get(p3) * 3 <= lastNumber) p3++;
            while (uglys.get(p5) * 5 <= lastNumber) p5++;
            
            uglys.add(Math.min(
                Math.min(uglys.get(p2) * 2, uglys.get(p3) * 3),
                uglys.get(p5) * 5
            ));
        }

        return uglys.get(n - 1);
    }
};
