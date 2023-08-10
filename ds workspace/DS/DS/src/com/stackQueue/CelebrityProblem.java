package com.stackQueue;

import java.util.Stack;

public class CelebrityProblem {

	public static void main(String[] args) {
		 int m[][] = { { 0, 0, 1, 0 },
                       { 0, 0, 1, 0 },
                       { 0, 0, 0, 0 },
                       { 0, 0, 1, 0 } };
	int i=	 findCelebrity(m);
	if(i== -1)
	System.out.println(" no one");
	else
		System.out.println(1+i+" is celebrity");
	}

	private static Integer findCelebrity(int[][] m) {
		Stack<Integer> s = new Stack();
		for(int i=0;i<m.length;i++)s.push(i);
		
		while(s.size()>1) {
			int i = s.pop();
			int j = s.pop();
			if(m[i][j]==1) {
				// agar i j ko janta hai to i celebrity nhi hai
				s.push(j);
			}else
			{
				// agar i j ko nhi janta to j celebrity nhi hai
			
				s.push(i);
			}
		}
		
		int pot = s.pop();
		for( int i= 0 ;i <m.length;i++) {
			
			if((i != pot && m[i][pot]==0) || m[pot][pot]==1)
				return -1;
		}
		
		return pot;
	}
}
