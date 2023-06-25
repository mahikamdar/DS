package com.dp;

import java.util.Arrays;

public class MinimumNoOfCoinToMakeGivenNo1D {

	public static void main(String[] args) {
		int [] coins = {0,1,5,6,9};
		int w =10;
		long [] t = new long[w+1];
		Arrays.fill(t, 1000);
		
		
		for(int i=1;i<coins.length;i++)
		{
			for(int j=coins[i];j<=w;j++) {
				
					t[j]= Math.min(t[j], 1+ t[j-coins[i]]);
				
					
			}
		}
		
//		System.out.println(t[w]);
		
//		for(int j=1 ;j<=w;j++) {
//			for(int i=0;i<coins.length;i++) {
//				if(j>=coins[i]) {
//					t[j]= Math.min(t[j], 1+ t[j-coins[i]]);
//				}
//			}
//		}
		System.out.println(t[w]);
	}
}
