import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> list = new ArrayList<>();

        int k = p.length();
        int count = 0;

        Map<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<p.length();i++){
            char ch = p.charAt(i);
            if(map.containsKey(ch)){
                int a = map.get(ch);
                map.put(ch,++a);
            }
            else{
                map.put(ch,1);
            }
        }

        count = map.size();
        int i = 0;
        int j = 0;

        while(j < s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                int a = map.get(ch);
                map.put(ch,--a);

                if(a == 0) count--;
            }

            if(j-i+1 < k){
                j++;
                continue;
            }

            if(j-i+1 == k){
                if(count == 0) {
                    list.add(i);
                }

                if(map.containsKey(s.charAt(i))){
                    int a = map.get(s.charAt(i));

                    if(a == 0) count ++;
                    map.put(s.charAt(i),++a);
                }
            }
            i++;
            j++;
        }

        return list;
    }
}