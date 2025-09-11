package Recursion;

public class towerOfHanoi {

    public static int solve(int s,int d,int h,int n){

        if(n==1){
            System.out.println("move "+ n+" from "+s+ " to " +d);
            return 1;
        }

        int moves = 0;

        moves += solve(s,h,d,n-1);
        System.out.println("move " +n+ " from " +s+ " to " +d);

        moves += solve(h,d,s,n-1);

        return moves;

    }

    public static void main(String[] args) {
        int n = 3;
        int s = 1;
        int h = 2;
        int d = 3;

        System.out.println("Total No. of moves: "+solve(s,d,h,n));
    }
    
}
 