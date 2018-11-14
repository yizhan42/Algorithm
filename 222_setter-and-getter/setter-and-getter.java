/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/setter-and-getter
@Language: Java
@Datetime: 16-03-20 03:29
*/

public class School {
    /*
     * Declare a private attribute *name* of type string.
     */
    
    // write your code here
      private String name;
      
    /**
     * Declare a setter method `setName` which expect a parameter *name*.
     */
    // write your code here
    public void setName(String name){
        this.name = name;
    }
    /**
     * Declare a getter method `getName` which expect no parameter and return
     * the name of this school
     */
    // write your code here
    public String getName(){
       
        
        return this.name;
    }
}