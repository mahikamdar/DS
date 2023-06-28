package com.dp;

public class WayToMakeAbyGivenCoin {

	public static void main(String[] args) {
		int coins[] = {0,2,3,5,10};
		int weight =15;
		int [][]  t = new int[coins.length][weight+1];
		

		for(int i=1;i<coins.length;i++)
		{
			t[i][0]=1;
			for(int j=1;j<=15;j++) {
			t[0][j]=0;
				if(coins[i]>j) {
					
					t[i][j]=t[i-1][j];
				}
				else
					t[i][j]= t[i-1][j]+t[i][j-coins[i]];
			}
		}
		
		System.out.println(t[coins.length-1][weight]);
	}
}
