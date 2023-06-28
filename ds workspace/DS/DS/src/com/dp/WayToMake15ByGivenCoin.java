package com.dp;

public class WayToMake15ByGivenCoin {

	public static void main(String[] args) {
		int coins[] = {0,2,3,5,10};
		int w =15;
		long [] t = new long[w+1];
		t[0]=1;
		
		for(int i=1;i<coins.length;i++)
		{
			for(int j=coins[i];j<=w;j++) {
				t[j] = t[j]+t[j-coins[i]];
			}
		}
		
		System.out.println(t[w]);
	}
}
