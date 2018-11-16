```
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/search-in-a-big-sorted-array
@Language: Markdown
@Datetime: 16-12-16 02:22
```

1.ArrayReader (transit-java dev API)
http://cognitect.github.io/transit-java/com/cognitect/transit/ArrayReader.html

2、关键地方
int index = 1;
while( reader.get(index - 1) < target){
      index = index * 2;
}

3、注意注释部分class ArrayReader{}