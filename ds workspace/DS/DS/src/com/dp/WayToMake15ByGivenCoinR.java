package com.dp;

public class WayToMake15ByGivenCoinR {
	public static void main(String[] args) {
		int arr[] = {2,3,5,10};
		int n =15;
		int index = arr.length-1;
		
	int out =count(arr,index,n);
	System.out.println(out);
	
	}

	private static int count(int[] s, int index, int n) {
		
		if(n==0) return 1;
		
		if(n<0 || index<0)
			return 0;
		
		return count(s,index-1,n)+count(s,index,n-s[index]);
	}
}
