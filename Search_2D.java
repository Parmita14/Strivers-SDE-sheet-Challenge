import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int rows =0;
        int cols = mat.get(0).size()-1;
        // int i = mat.get(0).get(cols);
        while(rows < mat.size() && cols >= 0 ){
            if(target == mat.get(rows).get(cols))return true;
            if(target < mat.get(rows).get(cols))cols--;
            else rows++;
        }
        return false;
    }
}
