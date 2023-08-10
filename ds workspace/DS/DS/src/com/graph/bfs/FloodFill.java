package com.graph.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {

	static class pair
	{
	    int first, second;
	    public pair(int first, int second)
	    {
	        this.first = first;
	        this.second = second;
	    }
	}
	static int rowNbr[] =  { 0,  0, 1, -1};
	static int colNbr[] =  { -1, 1, 0,  0 };
	public static void main(String[] args) {
		 int m[][] = new int[][] {
			 { 1, 1, 0, 5, 0 },
             { 0, 1, 1, 1, 1 },
             { 1, 0, 0, 1, 1 },
             { 0, 0, 0, 0, 0 },
             { 1, 0, 1, 0, 1 } };
             boolean visited [] [] = new boolean[m.length][m.length];
             
             FloodFill I = new FloodFill();
            int row=2;int col=2;
     fillWithFlood(m,visited,row,col,3,m[row][col]);
     
     for(int i=0;i<m.length;i++) {
			for(int j=0;j<m.length;j++ ) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
     
     
	}

	private static void fillWithFlood(int[][] m, boolean [][] visited,int x,int y,int value,int curr) {
		
		
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m.length;j++ ) {
				if( visited[i][j]==false) {
				 BFS(m,i,j,visited,value,curr);
				
				}
			}
		}
		
	}

	private static void BFS(int[][] m, int i, int j, boolean[][] visited,int value,int curr) {
		  Queue<pair> q = new LinkedList();
		  q.add(new pair(i,j));
		  visited[i][j]=true;
		if(m[i][j]==curr)
		 m[i][j]=value;
		  while(q.size()>0) {
			  
			  pair pair = q.poll();
			  
			  for(int k=0;k<rowNbr.length;k++) {
				  int iNew= pair.first+rowNbr[k];
				  int jNew = pair.second +colNbr[k];
				  if(isValid(iNew,jNew,m,visited)) {
					  visited[iNew][jNew]=true;
					  if(curr==m[i][j])
						  m[i][j]=value;
					  q.add(new pair(iNew,jNew));
				  }
			  }
		  }
		
	}

	private static boolean isValid(int iNew, int jNew, int[][] m, boolean[][] visited) {
		if(iNew <0 || jNew <0 || iNew>= m.length || jNew >= m.length || m[iNew][jNew] !=1 || visited[iNew][jNew] ==true)
		return false;
		return true;
	}
}
