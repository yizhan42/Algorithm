```
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/implement-queue-by-interface
@Language: Markdown
@Datetime: 16-10-31 00:50
```

1、接口里的“抽象方法”只要做声明即可，而不用定义其处理的方式。
2、数据成员 必须赋初值
3、利用接口打造新的类的过程，称之为接口的实现。以下为接口实现的语法。
class 类名称 implements 接口A,接口B
{
   ...
}
4、一个类只能继承一个父类，但却可以实现多个接口。
5、一个接口可以继承多个接口

**pop()弹出第一个元素
top()读取第一个元素
stack.peek()读取第一个元素而不弹出**