/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/implement-queue-by-two-stacks
@Language: Java
@Datetime: 16-11-01 13:56
*/

public class Queue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Queue() {
       // do initialization if necessary
       stack1 = new Stack<Integer>();
       stack2 = new Stack<Integer>();
    }
       public void stack2ToStack1(){
           while(!stack2.empty()){
               stack1.push(stack2.pop());
           
       }
    }
    
    public void push(int element) {
        // write your code here
        stack2.push(element);
    }

    public int pop() {
        // write your code here
        if(stack1.empty()){
            this.stack2ToStack1();
        }
        return stack1.pop();
    }

    public int top() {
        // write your code here
        if(stack1.empty()){
            this.stack2ToStack1();
        }
        return stack1.peek();
    }
}