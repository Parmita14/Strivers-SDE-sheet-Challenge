public import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
		  int n = permutation.size(); // size of the array.

       
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (permutation.get(i) < permutation.get(i + 1)) {
                
                ind = i;
                break;
            }
        }

       
        if (ind == -1) {
           
            Collections.reverse(permutation);
            return permutation;
        }

        

        for (int i = n - 1; i > ind; i--) {
            if (permutation.get(i) > permutation.get(ind)) {
                int tmp = permutation.get(i);
                permutation.set(i, permutation.get(ind));
                permutation.set(ind, tmp);
                break;
            }
        }

        
        List<Integer> sublist = permutation.subList(ind + 1, n);
        Collections.reverse(sublist);

        return permutation;
    }
	
	
}
 
