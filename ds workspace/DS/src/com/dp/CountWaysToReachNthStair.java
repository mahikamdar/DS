package com.dp;

import java.util.Arrays;

//There are n stairs, a person standing at the bottom
//wants to reach the top. The person can climb either
//1 stair or 2 stairs at a time. Count the number of ways,
//the person can reach the top.

//Input: n = 1
//Output: 1
//There is only one way to climb 1 stair
//
//Input: n = 2
//Output: 2
//There are two ways: (1, 1) and (2)
//
//Input: n = 4
//Output: 5
//(1, 1, 1, 1), (1, 1, 2), (2, 1, 1), (1, 2, 1), (2, 2) 
public class CountWaysToReachNthStair {
public static void main(String[] args) {
	int n =4;
	int count = count(n);
	System.out.println(count);
}

private static int count(int n) {
	int [] dp = new int[n+1];
	Arrays.fill(dp, -1);
	
	countWay(n,dp);
	return dp[n];
}

private static int countWay(int n, int[] dp) {
	if(n<=1)
		return 1;
	if(dp[n] != -1)
		return dp[n];
	
	dp[n]= countWay(n-1, dp) + countWay(n-2,dp);
	return dp[n];
	
}
}
