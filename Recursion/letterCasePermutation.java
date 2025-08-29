package Recursion;
import java.util.*;
class Solution {
    public static List<String> letterCasePermutation(String s) {

        String ip = s;
        StringBuilder op = new StringBuilder();
        ArrayList<String> strL = new ArrayList<>();

        solve(ip,op,strL);

        return strL;
    }

    public static void solve(String ip, StringBuilder op, ArrayList<String> strL){
        if(ip.length() == 0){
            String result = op.toString();
            strL.add(result);
            return;
        }

        else if(Character.isLetter(ip.charAt(0))){
            StringBuilder op1 = new StringBuilder(op);
            StringBuilder op2 = new StringBuilder(op);

            op1.append(Character.toLowerCase(ip.charAt(0)));
            op2.append(Character.toUpperCase(ip.charAt(0)));

            String input = ip.substring(1);

            solve(input,op1,strL);
            solve(input,op2,strL);

        }

        else{
            StringBuilder op1 = new StringBuilder(op);

            op1.append(ip.charAt(0));
            String input = ip.substring(1);

            solve(input,op1,strL);
        }
    }

    public static void main(String[] args) {
        String s = "a1b";

       System.out.println( letterCasePermutation(s));
    }
}
