package Recursion;
import java.util.*;
public class generateAllBalancedParenthesis {
    public static List<String> parenthesis(int n){
        ArrayList<String> list = new ArrayList<>();
        int open = n;
        int close = n;
        StringBuilder op = new StringBuilder();

        solve(open,close,op,list);

        return list;
    }

    public static void solve(int open, int close, StringBuilder op, ArrayList<String> list){
        if(open == 0 && close == 0){
            list.add(op.toString());
            return;
        }

        if(open > 0){
            StringBuilder op1 = new StringBuilder(op);
            op1.append('(');
            solve(open-1,close,op1,list);
        }

        if(close > open){
            StringBuilder op2 = new StringBuilder(op);
            op2.append(')');
            solve(open,close-1,op2,list);
        }
        return;
    }

    public static void main(String[] args) {
       int n = 3;
       System.out.println( parenthesis(n));
    }
}

