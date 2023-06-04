public import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<Long> generateRows(int Row){
		ArrayList<Long> list = new ArrayList<>();
		list.add((long)1);
		Long ans = (long)1;
		for(int col=1;col<Row;col++){
			ans = ans*(Row-col);
			ans = ans/col;
			list.add(ans);
		}
		return list;
	} 
	
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
				 ArrayList<ArrayList<Long>> answer = new ArrayList<>();
				 for(int i=1;i<=n;i++){
					 answer.add(generateRows(i));
				 }
	return answer;
	}
}
 {
    
}
