```
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/remove-duplicates-from-unsorted-list
@Language: Markdown
@Datetime: 16-10-16 03:15
```

1、dummy节点应用

2、java中的Set集合HashSet集合_百度经验  http://jingyan.baidu.com/article/19020a0a069e63529d2842a0.html

 * Set: 无序 （存储的元素顺序和提取顺序不同）、 唯一（存储的元素不能是相同的）

 * List： 有序 （存储的元素顺序和提取顺序相同）、 可重复（存储的元素可以是相同的）

 *	Set子类：HashSet 、 TreeSet 

HashSet：

 此类实现 Set 接口，由哈希表（实际上是一个 HashMap 实例）支持。

 * 它不保证 set 的迭代顺序；特别是它不保证该顺序恒久不变。

 * 

 * 它为什么会保持为唯一性呢？

 * 因为：底层是通过hashcode（） 和 equals（） 方法进行判断的！

3、Contains方法用来查找某个对象在不在列表之中