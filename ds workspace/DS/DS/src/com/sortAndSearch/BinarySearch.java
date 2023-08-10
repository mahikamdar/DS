package com.sortAndSearch;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr [] = {3,5,13,67,4};
		int n =67;
	//int index=	binarySearch(arr, n);
	int index=	binarySearchR(arr, n);
	System.out.println(index);
	}

	private static int binarySearchR(int[] arr, int n) {
		int m = (arr.length-1)/2;
		int index = binarySearch(arr, n, 0,m,arr.length-1);
		return index;
	}

	private static int binarySearch(int[] arr, int n, int l, int m, int r) {
		if(n == arr[m])
			return m;
		m = (l+r)/2;
		if(n == arr[m])
			return m;
		if(n>arr[m])
			l= m+1;
		else
			r= m-1;
	return	binarySearch(arr, n, l , m, r);
	}

	private static int binarySearch(int[] arr, int n) {
		Arrays.sort(arr);
		
		int l=0; int r=arr.length-1;
		int j=0;
		
		while(l<r) {
			
			if(n== arr[j])
				return j;
			j = (l+r)/2;
			if(n== arr[j])
				return j;
			else
				if(n>arr[j]) 
					l=j+1;
				else
					r=j-1;
		}
		return j;
	}
}
