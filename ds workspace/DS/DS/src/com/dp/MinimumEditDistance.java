package com.dp;

public class MinimumEditDistance {

	public static void main(String[] args) {
//		String[] s1= {"","a","b","c","f","g"};
//		String[] s2= {"","a","d","c","e","g"};
		String[] s1= {"","a","b","a","a","b","a"};
		String[] s2= {"","b","a","b","b","a","b"};
		int t[] []= new int[s1.length][s2.length];
		
		for(int i=1;i<s1.length;i++) {
			
			for(int j=1;j<s2.length;j++) {
				if(s1[i]==s2[j]) {
					t[i][j]= t[i-1][j-1];
				}else
					t[i][j]= 1+Math.min(Math.min(t[i][j-1], t[i-1][j]),t[i-1][j-1]);
			}
		}
		
		System.out.println(t[s1.length-1][s2.length-1]);
	}
}
