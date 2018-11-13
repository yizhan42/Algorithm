```
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/lowest-common-ancestor
@Language: Markdown
@Datetime: 16-12-22 13:23
```

1. 自己做running37%
2. 最近公共祖先 (Lowest common ancestor) - Yuwen's Hero - 博客频道 - CSDN.NET  http://blog.csdn.net/beiyetengqing/article/details/7633651
3. 查找两个node的最早的公共祖先，分三种情况：
1). 如果两个node在root的两边，那么最早的公共祖先就是root。
2). 如果两个node在root的左边，那么把root.leftChild作为root，再递归。
3). 如果两个node在root的右边，那么把root.rightChild作为root，再递归。
4. 