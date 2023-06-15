import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int cnt1 =0;
        int cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(cnt1 == 0 && arr.get(i) != el2){
               
                cnt1 = 1;
                 el1 = arr.get(i);
            }else if(cnt2 == 0 && arr.get(i) != el1){
                el2 = arr.get(i);
                cnt2 = 1;
            }else if(arr.get(i) == el1)cnt1++;
            else if(arr.get(i) == el2)cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
            
        }
        int c1=0,c2=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) == el1)c1++;
            if(arr.get(i) == el2)c2++;

        }
        if(c1 >= (int)(arr.size()/3)+1)
        ans.add(el1);
        if(c2 >= (int)(arr.size()/3)+1)
        ans.add(el2);
        Collections.sort(ans);
        return ans;
    }
}