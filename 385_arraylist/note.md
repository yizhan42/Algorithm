```
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/arraylist
@Language: Markdown
@Datetime: 16-10-09 02:20
```

java int与integer的区别 - 发表是最好的记忆 - 博客园  http://www.cnblogs.com/shenliang123/archive/2011/10/27/2226903.html

int与integer的区别从大的方面来说就是基本数据类型与其包装类的区别：

int 是基本类型，直接存数值，而integer是对象，用一个引用指向这个对象

1.Java 中的数据类型分为基本数据类型和复杂数据类型

int 是前者而integer 是后者（也就是一个类）；因此在类进行初始化时int类的变量初始为0.而Integer的变量则初始化为null.


　Java中int和Integer关系是比较微妙的。关系如下：

　　1.int是基本的数据类型；

　　2.Integer是int的封装类；

　　3.int和Integer都可以表示某一个数值；

　　4.int和Integer不能够互用，因为他们两种不同的数据类型；