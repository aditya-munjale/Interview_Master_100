package SlidingWindow;

public class maxSumSubarrofSizeK {

    public static int maxSum(int arr[],int k){

        int sum = 0;
        int max = 0;
        int j = 0;
        int i = 0;

        while(j < arr.length ){

            sum = sum + arr[j];

            if(j-i+1 < k){
                j++;
            }

            else if(j-i+1 == k){
                max = Math.max(max,sum);

                sum = sum - arr[i];
                i++;
                j++;
            }

        }

        return max;

    }

    public static void main(String[] args) {
        int arr[] = {2,5,1,8,2,9,1};
        int k = 3;

        System.out.println(maxSum(arr,k));
    }
    
}
