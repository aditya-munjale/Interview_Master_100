package Recursion;

public class kthSymbolinGrammer {

    public static int solve(int n, int k){
        if(n==1 && k==1){
            return 0;
        }

        int mid = (int)Math.pow(2,n-1)/2;

        if( k <= mid){
            return solve(n-1, k);
        }
        else{
            return 1-solve(n-1,k-mid);
        }
    }

    public static void main(String[] args) {
        int n = 2;
        int k = 2;
       System.out.println(solve(n,k));
    }

}
