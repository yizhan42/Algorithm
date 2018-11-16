/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/simple-calculator
@Language: Java
@Datetime: 16-09-25 01:42
*/

public class Calculator {
    /**
      * @param a, b: Two integers.
      * @param operator: A character, +, -, *, /.
      */
    public int calculate(int a, char operator, int b) {
        /* your code */
        
        switch(operator){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
        }
    return 0;
    }
}