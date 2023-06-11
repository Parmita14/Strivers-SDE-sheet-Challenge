import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        // Write your code here.
        //   int n = height.length;
        // calculate leftmax boundary
        long leftmax[] = new long[n];
        leftmax[0] = arr[0];
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(arr[i],leftmax[i-1]);
        }
        // calculate rightmax boundary
        long rightmax[] = new long[n];
        rightmax[n-1] = arr[n-1];
        for(int i =n-2;i>=0;i--){
            rightmax[i] = Math.max(arr[i] , rightmax[i+1]);
        }
        // loop
        long trappedwater = 0;
        for(int i=0;i<n;i++){
            long waterlevel = Math.min(leftmax[i] , rightmax[i]);
            trappedwater = trappedwater + (waterlevel - arr[i]);
        }
        return trappedwater;
    }
}
