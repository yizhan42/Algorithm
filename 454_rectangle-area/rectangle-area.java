/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/rectangle-area
@Language: Java
@Datetime: 16-03-20 12:27
*/

public class Rectangle {
    /*
     * Define two public attributes width and height of type int.
     */
    // write your code here
public int width;
public int height;
int result;
    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here
    public Rectangle(int width,int height){
         result = width * height;
    }
    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
    public int getArea(){
        
        return result;
    }
}
