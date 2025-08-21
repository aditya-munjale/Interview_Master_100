package Recursion;
import java.util.*;
public class deleteMiddleStack {

    public static Stack<Integer> midDelete(Stack<Integer> s,int size){

        if(s.size() == 0) return s;

        solve(s,(s.size()/2) + 1);
        return s;

    }

    public static void solve(Stack<Integer> s, int k){
        if(k==1){
            s.pop();
            return;
        }
        int temp = s.pop();
        solve(s,k-1);
        s.push(temp);
        return;
    }

    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.addAll(Arrays.asList(7,8,5,2,4));

      

        System.out.print(midDelete(s, 5));
    }
    
}
