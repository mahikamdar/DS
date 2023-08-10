package com.graph.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class NoOfIslands {

	static class pair
	{
	    int first, second;
	    public pair(int first, int second)
	    {
	        this.first = first;
	        this.second = second;
	    }
	}
	static int rowNbr[] =  { -1, -1, -1,  0,  0,  1, 1, 1 };
	static int colNbr[] =  { -1,  0,  1, -1,  1, -1, 0, 1 };
	public static void main(String[] args) {
		 int M[][] = new int[][] { { 1, 1, 0, 0, 0 },
             { 0, 1, 0, 0, 1 },
             { 1, 0, 0, 1, 1 },
             { 0, 0, 0, 0, 0 },
             { 1, 0, 1, 0, 1 } };
             int visited [] [] = new int[M.length][M.length];
             
             NoOfIslands I = new NoOfIslands();
System.out.println("Number of islands is: "
      + I.countIslands(M,visited,0,0));
	}

	private Integer countIslands(int[][] m, int [][] visited,int x,int y) {
		
		int count=0;
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m.length;j++ ) {
				if(m[i][j]==1 && visited[i][j]==0) {
				 BFS(m,i,j,visited);
				 count++;
				}
			}
		}
		return count;
	}

	private void BFS(int[][] m, int i, int j, int[][] visited) {
		  Queue<pair> q = new LinkedList();
		  q.add(new pair(i,j));
		  visited[i][j]=1;
		  while(q.size()>0) {
			  
			  pair pair = q.poll();
			  
			  for(int k=0;k<rowNbr.length;k++) {
				  int iNew= pair.first+rowNbr[k];
				  int jNew = pair.second +colNbr[k];
				  if(isValid(iNew,jNew,m,visited)) {
					  visited[iNew][jNew]=1;
					  q.add(new pair(iNew,jNew));
				  }
			  }
		  }
		
	}

	private boolean isValid(int iNew, int jNew, int[][] m, int[][] visited) {
		if(iNew <0 || jNew <0 || iNew>= m.length || jNew >= m.length || m[iNew][jNew] !=1 || visited[iNew][jNew] !=0)
		return false;
		return true;
	}
}
