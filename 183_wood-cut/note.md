```
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/wood-cut
@Language: Markdown
@Datetime: 16-12-16 02:57
```

1.Java.lang.Math.max() Method
 https://www.tutorialspoint.com/java/lang/math_max_int.htm
 
 2.根据给出的例子往代码里套
 [232, 124, 456]   k=7
 L.length=3
 L[0]=232
 L[1]=124
 L[2]=456
 max=456
 mid=1+(456-1)/2=228
 
 count(L, 228):
 i=0,sum=77
 i=1, sum = 118
 i=2, sum = 270
 start = mid = 228
 end = 456
 mid = 228+(456-228)/2=342
 
 count(L, 342)
 i = 0, sum = 0 + 232/228 = 0
 i = 1, sum = 0
 i = 2, sum = 0+456/228=2
 
 end = 228
 start = 1
 mid = 1+(228-1)/2=114
 
 count(L, 114)
 i = 0, sum = 0+232/114=2
 i = 1, sum = 2+124/114=3
 i= = 2, sum = 3 + 456/114=7
 
 start = 114 , end = 228
 mid = 114 +(228-114)/2 = 171
 
 count(L, 228)
 i = 0 , sum = 0+232/228=1
 i = 1,  sum = 1 + 124/228 = 1
 i = 2, sum = 1 + 456/228 = 3  < 7(k)

count(L, 114)
i = 0 ,sum = 2
i = 1, sum = 3
i = 2, sum = 7 = 7(k)
所以，return start;(114)
