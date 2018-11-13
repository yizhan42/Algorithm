/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/3sum-closest
@Language: Java
@Datetime: 17-02-25 12:22
*/

public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @param target : An integer
     * @return : return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] numbers, int target) {
        // write your code here
         if (numbers == null || numbers.length < 3) {
            return -1;
        }
        
        Arrays.sort(numbers);
        int bestSum = numbers[0] + numbers[1] + numbers[2];
        for (int i = 0; i < numbers.length; i++) {
            int start = i + 1, end = numbers.length - 1;
            while (start < end) {
                int sum = numbers[i] + numbers[start] + numbers[end];
                if (Math.abs(target - sum) < Math.abs(target - bestSum)) {
                    bestSum = sum;
                }
                if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        
        return bestSum;
    }
}
