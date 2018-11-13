```
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/strstr
@Language: Markdown
@Datetime: 16-12-12 02:58
```

1、JavaScript charAt() 方法  http://www.w3school.com.cn/jsref/jsref_charAt.asp

2、双层循环（另一个典型的冒泡排序）

3、source: abcda
target: bcd
1) i = 0, j = 0    a != b
2) i = 1, j = 0     b = b,
    i = 1, j = 1     c = c
	i = 1, j = 2     d = d
3) i = 2, j = 0     c != b
4) i = 3,  j = 0     d != b

4、字符串target.length()
     数组nums.length