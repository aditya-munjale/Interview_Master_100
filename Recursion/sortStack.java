package Recursion;
import java.util.*;
public class sortStack {

    public static void sort(Stack<Integer> stack){
        if(stack.size() == 1)  return;

        int temp = stack.pop();
        sort(stack);
        insert(stack,temp);
    }

    public static void insert(Stack<Integer> stack,int temp){
       
        if(stack.size() == 0 || stack.peek() <= temp){
            stack.push(temp);
            return;
        }

        int val = stack.pop();
        insert(stack,temp);
        stack.push(val);

        return;
    }
    

    public static void main(String args[]){
       Stack<Integer> stack = new Stack<>();
       stack.addAll(Arrays.asList(90,70,20,40));

       sort(stack);
       System.out.println(stack+" ");
    }
}
