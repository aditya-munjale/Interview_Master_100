package Recursion;
import java.util.*;
public class reverseStack {

    public static void reverse(Stack<Integer> s){
        if(s.size() == 1){
            return;
        }
        int temp = s.pop();
        reverse(s);
        insert(s,temp);
    }

    public static void insert(Stack<Integer> s, int temp){

        if(s.isEmpty()){
            s.push(temp);
            return;
        }

        int x = s.pop();
        insert(s,temp);
        s.push(x);

    }

    public static void main(String args[]){
       Stack<Integer> s = new Stack<>();
       s.addAll(Arrays.asList(1,2,3,4,5));
       
       reverse(s);

       System.out.println(s);
    }
    
}
