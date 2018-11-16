/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/name-deduplication
@Language: Java
@Datetime: 16-09-26 02:27
*/

public class Solution {
    /**
     * @param names a string array
     * @return a string array
     */
    public List<String> nameDeduplication(String[] names) {
        // Write your code here
        List<String> result = new ArrayList<String>();
        HashMap<String, Integer> mp = new HashMap<String, Integer>();
        for (int i = 0; i < names.length; ++i) {
            String str = names[i].toLowerCase();
            if (!mp.containsKey(str)) {
                mp.put(str, 1);
                result.add(str);
            }
        }
        return result;
    }
}