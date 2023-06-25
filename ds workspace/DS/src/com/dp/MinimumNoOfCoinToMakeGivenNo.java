package com.dp;

import java.util.Arrays;
import java.util.List;

public class MinimumNoOfCoinToMakeGivenNo {

	public static void main(String[] args) {
		int [] coins = {0,1,5,6,9};
		int w =10;
		int [][] t = new int[coins.length][w+1];
		
		for(int i=1;i<coins.length;i++) {
		
			for(int j=1;j<=w;j++) {
				
				if(coins[i]>j) {
					t[i][j]= t[i-1][j];
				}else {
					t[i][j]= Math.min(t[i-1][j], t[i][j-coins[i]]+1);
				}
			}
		}
	
		//System.out.println(t[coins.length-1][w]);
		List<int[]> list = Arrays.asList(t);
		
		
	}
}
