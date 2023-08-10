package com.graph.backtracking;

public class MinimumStepKnightTour {

	static int row[ ]= {2, 1, -1, -2, -2, -1, 1, 2};
	static int col[] = {1, 2, 2,  1, -1, -2, -2, -1};
	static int src[] = {0,0};
	 static int dest[] = {2,1};
	
	public static void main(String[] args) {
		int visited[][] = new int [8][8];
		int moveCount =1;
		visited[0][0]=moveCount;
		
		findSolution(src[0],src[1],moveCount,visited);
		
	}

	private static boolean findSolution(int x, int y, int moveCount, int[][] visited) {
		if(x==dest[0] && y== dest[1]) {
			System.out.println();
			for(int i=0;i<8;i++) {
				for(int j=0;j<8;j++)if(visited[i][j]>9)
					System.out.print(visited[i][j] + "  "); 
					else
					System.out.print("0"+visited[i][j]+"  ");
				System.out.println();
			}
			return true;
		}else {
			 
			for (int index =0;index<8;index++) {
				int newX = x+row[index];
				int newY= y+col[index];
				if(isValid(newX,newY,visited)) {
					moveCount = applyValue(moveCount, visited, newX, newY);
//					if(findSolution(newX, newY, moveCount, visited))
//						return true;
					findSolution(newX, newY, moveCount, visited);
					moveCount = removeValue(moveCount, visited, newX, newY);
				}
			}
			
			return false;
		}
		
	}

	private static int removeValue(int moveCount, int[][] visited, int newX, int newY) {
		moveCount--;
		visited[newX][newY]= 0;
		return moveCount;
	}

	private static int applyValue(int moveCount, int[][] visited, int newX, int newY) {
		moveCount++;
		visited[newX][newY]= moveCount;
		return moveCount;
	}

	private static boolean isValid(int newX, int newY, int[][] visited) {
		if(newX<0 || newX>7 || newY<0 || newY >7 || visited[newX][newY] != 0)
		return false;
		return true;
	}
}
