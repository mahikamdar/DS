package com.graph.backtracking;

public class RatInMaze {

	static int[] newRow = { 1, 0, -1, 0 };
	static int[] newCol = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		
		int maze [][] = {
				{1, 1, 0, 1},
				{0, 1, 1, 1},
				{0, 1, 0, 1},
				{0, 1, 1 ,1}
		};
		
		int visited[] [] = new int[4][4];
		visited[0][0]=1;
		int moveCount=1;
		findSolution(0,0,maze,visited,moveCount,3,3);

	}

	static boolean findSolution(int x, int y, int[][] maze, int[][] visited, int moveCount, int targetX, int targetY) {
		if(x==targetX && y==targetY) {
			System.out.println();
			for (int i = 0; i < visited.length; i++) {
				for (int j = 0; j < visited.length; j++) {
					System.out.print(visited[i][j]+", ");
				}
				System.out.println();
			}
			
			return true;
		}
		else {
			for(int index =0;index<newRow.length;index++) {
				int newX = x+newRow[index];
				int newY = y+ newCol[index];
				
				if(Valid(newX, newY, visited,maze)) {
					moveCount = applyValue(newX, newY, visited,moveCount);
					findSolution(newX, newY, maze, visited, moveCount, targetX, targetY);
						
					moveCount =removeValue(newX, newY, visited,moveCount);
				}
				
			}
			return false;
		}
		
	}

	private static int removeValue(int newX, int newY, int[][] visited, int moveCount) {
		moveCount--;
		visited[newX][newY]= 0;
		return moveCount;
	}

	private static int applyValue(int newX, int newY, int[][] visited, int moveCount) {
		moveCount++;
		visited[newX][newY]= moveCount;
		return moveCount;
	}

	private static boolean Valid(int newX, int newY, int[][] visited, int[][] maze) {
		if(newX<0 || newX>3 || newY<0 || newY>3 || visited[newX][newY] !=0 || maze[newX][newY]==0)
		return false;
		return true;
	}
}
