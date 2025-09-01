package Recursion;
import java.util.*;
public class josephusProblem {

    public static int solve(ArrayList<Integer> list, int k, int index){
        if(list.size() == 1){
            return list.get(0);
        }

        index = (index+k) % list.size();
        list.remove(index);

        return solve(list,k,index);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        int n = 40;
        for(int i=1; i<=n; i++){
           list.add(i);
        }

        int k = 7;
        k--;
        int index = 0;
        int ans = solve(list,k,index);
        System.out.println(ans);
    }

    
}
