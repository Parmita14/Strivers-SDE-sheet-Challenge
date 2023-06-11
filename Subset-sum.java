import java.util.* ;
import java.io.*; 
public class Solution {
   public static void func(int idx,int sum,int[] num,int n,ArrayList<Integer> ans){
        if(idx == n){
            ans.add(sum);
            return;
        }
        func(idx+1,sum+num[idx],num,n,ans);
         func(idx+1,sum,num,n,ans);
    }
    public static ArrayList<Integer> subsetSum(int num[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = num.length;
        func(0,0,num,n, ans);
        Collections.sort(ans);
        return ans;
    }

}