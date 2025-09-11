package Recursion;
import java.util.*;

public class sortArray {

    public static void sort(ArrayList<Integer> list){
        if(list.size() == 1){
            return;
        }

        int temp = list.get(list.size()-1);
        list.remove(list.size()-1);
        sort(list);
        insert(temp,list);
    }

    public static void insert(int temp, ArrayList<Integer> list){
        if(list.size() == 0 || list.get(list.size()-1) <= temp){
            list.add(temp);
            return;
        }

        int val = list.get(list.size()-1);
        list.remove(list.size()-1);
        insert(temp,list);
        list.add(val);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,2,4,6,1,5));

        System.out.println(list);
        sort(list);
        
        System.out.println(list);

    
    }
    
}
