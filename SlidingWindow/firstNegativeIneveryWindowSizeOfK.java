package SlidingWindow;
import java.util.*;

public class firstNegativeIneveryWindowSizeOfK {

    public static void firstNegative(int arr[],int k){
        Queue<Integer> q = new LinkedList<>();

        int i = 0;
        int j = 0;

        while(j < arr.length){

            if(arr[j] < 0){
                q.add(arr[j]);
            }

            if(j-i+1 < k){
                j++;
            }

            else if(j-i+1==k){
                //calculation

                if(q.size() == 0){
                    System.out.println("0");
                }
                else{
                    System.out.println(q.peek()+" ");
                    if(arr[i] == q.peek()){
                        q.remove();
                    }
                }
            i++;
            j++;
            }



        }


    }

    public static void main(String[] args) {
        int arr[] = {-2,5,-1,8,9,-10,11,-13};
        int k = 3;

        firstNegative(arr, k);
    }
    
}
