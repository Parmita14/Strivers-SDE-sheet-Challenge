import java.util.* ;
import java.io.*; 
public class Solution {
    public static void func(int idx, int nums[],List<Integer> ds,ArrayList<ArrayList<Integer>> ansList){
        ansList.add(new ArrayList<>(ds));
        for(int i=idx;i<nums.length;i++){
            if(i!=idx && nums[i] == nums[i-1])continue;
            ds.add(nums[i]);
            func(i+1,nums,ds,ansList);
            ds.remove(ds.size()-1);
        }
    }
           
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        // Write your code here..
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ansList = new ArrayList<>();
        func(0,arr,new ArrayList<>(),ansList);
        return ansList;
    }

}