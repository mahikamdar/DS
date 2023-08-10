package com.graph.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class RotInOrange {

	static int count=0;
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
			 { 2, 1, 1},
             { 1, 1, 0 },
             { 0, 1, 1 }};
             boolean visited [] [] = new boolean[m.length][m.length];
             
             RotInOrange I = new RotInOrange();
            int row=0;int col=0;
     timeToRot(m,visited,row,col,2,1);
     
     for(int i=0;i<m.length;i++) {
			for(int j=0;j<m.length;j++ ) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
     System.out.println("time to rot is "+count);
     
	}

	private static void timeToRot(int[][] m, boolean [][] visited,int x,int y,int value,int curr) {
		
		
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
		
		  while(q.size()>0) {
			  
			  pair pair = q.poll();
			  
			  for(int k=0;k<rowNbr.length;k++) {
				  int iNew= pair.first+rowNbr[k];
				  int jNew = pair.second +colNbr[k];
				  if(isValid(iNew,jNew,m,visited)) {
					  visited[iNew][jNew]=true;
					  if(curr==m[iNew][iNew])
						  m[iNew][iNew]=value;
					  q.add(new pair(iNew,jNew));
				  }
			  }
		  }
		count++;
	}

	private static boolean isValid(int iNew, int jNew, int[][] m, boolean[][] visited) {
		if(iNew <0 || jNew <0 || iNew>= m.length || jNew >= m.length || m[iNew][jNew] ==0 || visited[iNew][jNew] ==true)
		return false;
		return true;
	}
}
