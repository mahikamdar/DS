package com.dp;

public class WayToMake15ByGivenCoinR {
	public static void main(String[] args) {
		int arr[] = {2,3,5,10};
		int n =15;
		int m = arr.length;
		
	int out =count(arr,m,n);
	System.out.println(out);
	
	}

	private static int count(int[] s, int m, int n) {
		
		if(n==0) return 1;
		if(n<0)return 0;
		if(m<=0 && n>=1)
			return 0;
		
		return count(s,m-1,n)+count(s,m,n-s[m-1]);
	}
}
