package com.stackQueue;

public class MaximumAreaInHistrogram {

	public static void main(String[] args) {
		int [] arr= {4,2,1,5,6,3,2,4,2};
		int area=0;
		for(int i=0;i<arr.length;i++) {
			int l =i;
			int r =i;
			while(l>=0 && arr[l]>=arr[i]) l--;
			while(r<arr.length && arr[r]>= arr[i])r++;
			area  =Math.max(area, arr[i]*(r-l-1));
			
		}
		
		System.out.println(area);
	}
}
