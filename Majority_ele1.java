import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		int count = 0;
		int ele = 0;
		for(int i=0;i<arr.length;i++){
			if(count == 0){
				ele = arr[i];
				count++;
			}else if(arr[i] == ele){
				count++;
			}else{
				count--;}
		}
		int cnt =0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == ele)cnt++;
		}
		if(cnt > n/2)return ele;
		return -1;
	}
}