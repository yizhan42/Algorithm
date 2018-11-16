```
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/last-position-of-target
@Language: Markdown
@Datetime: 16-12-07 02:15
```

1、下标从0开始

2、如何判断数组是否为空？
http://bbs.csdn.net/topics/10177432

3、java中数组为空和数组长度为0的区别
http://blog.csdn.net/wangluqinglxq/article/details/38796057

4、int mid = (start + end) / 2;
int mid = start + (end - start) / 2;
一样


5、当nums[mid] == target时，让start = mid就保证了返回的一定是最后的位置

6、数组nums.length
     字符串 target.length()