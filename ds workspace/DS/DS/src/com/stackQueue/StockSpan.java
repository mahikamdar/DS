package com.stackQueue;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		

	 int price[] = { 10, 4, 5, 90, 120, 80 };
     int n = price.length;
     int S[] = new int[n];
     for( int i=0;i< n;i++)
    	 S[i]=1;

     // Fill the span values in array S[]
     calculateSpan(price, n, S);

     for( int i=0;i< n;i++)
    System.out.print(S[i]+" ");
}

	private static void calculateSpan(int[] price, int n, int[] op) {
		Stack<Integer> s = new Stack();
		 for(int i=0;i<price.length;i++) {
			 s.push(price[i]);
		 }
		
		 for(int i= price.length-2;i >=0;i--) {
			
			 int e = s.pop();
			for( int j=i;(j>=0 && e>price[j] );j--)	
				op[i+1]++;
				
		 }
	
	}
}
