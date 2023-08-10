package com.graph.backtracking;

public class NQueenProblem {

	

	public static void main(String[] args) {
		int visited[][] = new int[4][4];
		int moveCount = 0;
		visited[0][0] = moveCount;

		findSolution(-1, moveCount, visited);

	}

	private static boolean findSolution(int x, int moveCount, int[][] visited) {
		if (x == visited.length-1) {
			System.out.println();
			for (int i = 0; i < visited.length; i++) {
				for (int j = 0; j <visited.length; j++)
					System.out.print(visited[i][j] + "  ");

				System.out.println();
			}
			return true;
		} else {

			for (int col = 0; col < visited.length; col++) {
				int newX = x +1;
				int newY =col;
				if (isValid(newX, newY, visited)) {
					moveCount = applyValue(moveCount, visited, newX, newY);
//					if(findSolution(newX, moveCount, visited))
//						return true;
					findSolution(newX, moveCount, visited);

					moveCount = removeValue(moveCount, visited, newX, newY);
				}
			}

			return false;
		}

	}

	private static int removeValue(int moveCount, int[][] visited, int newX, int newY) {
		moveCount--;
		visited[newX][newY] = 0;
		return moveCount;
	}

	private static int applyValue(int moveCount, int[][] visited, int newX, int newY) {
		moveCount++;
		visited[newX][newY] = moveCount;
		return moveCount;
	}

	private static boolean isValid(int newX, int newY, int[][] visited) {

		
		for (int i = 0; i <newX; i++)
			if (visited[i][newY] > 0)
				return false;

		for (int i = newX, j = newY; i >=0 && j>=0; i--, j--) {
			if (visited[i][j] > 0)
				return false;
		}

		for (int i = newX,j= newY; i >= 0 && j< visited.length; i--, j++) {
			if (visited[i][j] > 0)
				return false;
		}

		return true;
	}
}
