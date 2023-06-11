public class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.
       int low = 1;
       int high = m;
       while(low <= high){
           int mid = low + (high-low)/2;
           if(Math.pow((double)mid,(double)n) == m)return mid;
           else if(Math.pow((double)mid,(double)n) > m)high = mid-1;
           else
           low = mid+1;
       }
       return -1;
    }
}
