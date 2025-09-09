package SlidingWindow;
import java.util.*;

public class countOccuranceOfAnagram {

    public static int solution(String str, String ptr){
        int ans = 0;
        int count = 0;
        int k = ptr.length();


        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<ptr.length();i++){
            char ch = ptr.charAt(i);

            if(map.containsKey(ch)){
                int a = map.get(ch);
                map.put(ch,++a);
            }
            else{
                map.put(ch,1);
            }
        }

        int i = 0;
        int j = 0;

        count = map.size();

        while(j < str.length()){

            char ch = str.charAt(j);
            if(map.containsKey(ch)){
                int a = map.get(ch);
                map.put(ch,--a);

                if(a==0) count--;
            }


            if(j-i+1 < k) {
                j++;
                continue;
            }

            if(j-i+1 == k){
                if(count == 0) ans++;

                if(map.containsKey(str.charAt(i))){
                    int a = map.get(str.charAt(i));

                    if(a == 0) count ++;
                    map.put(str.charAt(i),++a);
                }
            }
            i++;
            j++;
        }

        return ans;
    }
    public static void main(String[] args) {
        String str = "aabaabaa";
        String ptr = "aaba";

        System.out.println(solution(str,ptr));
    }
    
}
