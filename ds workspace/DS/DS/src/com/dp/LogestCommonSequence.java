package com.dp;

public class LogestCommonSequence {
public static void main(String[] args) {
	String[] s1= {"","a","b","a","a","b","a"};
	String[] s2= {"","b","a","b","b","a","b"};
	int t[] []= new int[s1.length][s2.length];
	
	for(int i=1;i<s1.length;i++) {
		
		for(int j=1;j<s2.length;j++) {
			if(s1[i]==s2[j]) {
				t[i][j]= 1+t[i-1][j-1];
			}else
				t[i][j]= Math.max(t[i][j-1], t[i-1][j]);
		}
	}
	
	System.out.println(t[s1.length-1][s2.length-1]);
}
}
