```
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/valid-parentheses
@Language: Markdown
@Datetime: 16-11-01 13:48
```

数据结构-栈和队列 - guisu，程序人生。 逆水行舟，不进则退。 - 博客频道 - CSDN.NET  http://blog.csdn.net/hguisu/article/details/7674195


栈的基本运算有六种：

构造空栈：InitStack(S)、

判栈空: StackEmpty(S)、

判栈满： StackFull(S)、

进栈： Push(S,x)、可形象地理解为压入，这时栈中会多一个元素

退栈： Pop(S) 、 可形象地理解为弹出，弹出后栈中就无此元素了。

取栈顶元素：StackTop(S),不同与弹出，只是使用栈顶元素的值，该元素仍在栈顶不会改变。


Java.util.Stack类的peek()方法 - wodwl的专栏 - 博客频道 - CSDN.NET  http://blog.csdn.net/wodwl/article/details/4368759
Java.util.Stack这个类不难，但需要注意其中的peek()方法： 查看栈顶对象而不移除它