package com.stackQueue;

public class NextSmallerNumber {
	 public static void main(String args[])
	    {
	        int arr[] = { 11, 13, 21, 3 };
	        int n = arr.length;
	        printNSE(arr, n);
	    }

	private static void printNSE(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			int next=-1;
			for(int j= i+1;j<n;j++) {
				if(arr[i]>arr[j] && j< n)
				{
					next= arr[j];
					break;
				}
			}
			
			System.out.println("for "+arr[i]+ " next is "+next);
		}
		
	}
}
