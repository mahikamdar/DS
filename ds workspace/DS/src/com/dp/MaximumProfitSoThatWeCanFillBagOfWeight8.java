package com.dp;

public class MaximumProfitSoThatWeCanFillBagOfWeight8 {

	public static void main(String[] args) {
		int[] givenW= {0,3,4,6,5};
		int[] givenP= {0,2,3,1,4};
		
		//make sorted array
		int[] w= {0,3,4,5,6};
		int[] p= {0,2,3,4,1};
		
		int tw= 8;
		int m[][] = new int[w.length][tw+1];
		for(int i=1;i<w.length;i++) {
		
			for(int j=1;j<=tw;j++) {
				if(w[i]>j) {
					m[i][j]= m[i-1][j];
				}else {
					m[i][j]= Math.max(m[i-1][j], m[i-1][j-w[i]]+p[i]);
				}
			}
		}
		
		System.out.println(m[w.length-1][tw]);
	}
}
