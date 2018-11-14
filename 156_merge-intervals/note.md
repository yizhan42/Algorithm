```
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/merge-intervals
@Language: Markdown
@Datetime: 16-11-10 09:00
```

java List 排序 Collections.sort() - 小媛在努力~ - 博客频道 - CSDN.NET  http://blog.csdn.net/zxy_snow/article/details/7232035

用Java集合中的Collections.sort方法对list排序的两种方法 - OPEN 开发经验库  http://www.open-open.com/lib/view/open1322614659562.html


1 先把区间按照开头排序。
2 然后一个一个放进来，如果和前一个重合则合并，否则就直接放进去。