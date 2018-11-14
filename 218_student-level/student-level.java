/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/student-level
@Language: Java
@Datetime: 16-03-20 12:35
*/

public class Student {
    /**
     * Declare two public attributes name(string) and score(int).
     */
    // write your code here
   public String name;
   public int score;
    /**
     * Declare a constructor expect a name as a parameter.
     */
    // write your code here
    public Student (String name){
        this.name = name;
    }
    /**
     * Declare a public method `getLevel` to get the level(char) of this student.
     */
    // write your code here
    public char getLevel()
    {
        if(score >= 90){
            return 'A';
        }else if(score >= 80){
            return 'B';
        }else if(score >=60){
            return 'C';
        }else
        {
            return 'D';
        }
    }
}