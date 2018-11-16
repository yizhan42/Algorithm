```
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/binary-tree-paths
@Language: Markdown
@Datetime: 16-11-04 12:10
```

**path理解不好**

String、String.valueOf、toString 它们三者的区别总结 - Mr唐 - 博客园  http://www.cnblogs.com/tyhJava/p/5693238.html

当把最后两个if中的helper变成helpler(root.left,path +"->" + root.left.val, result); 时，也能AC。

1->2->5 中 （1->）是一组，（2->）是一组，剩下一个5，就如同只有根节点


