package com.graph.backtracking;

public class PrintPermutation {
public static void main(String[] args) {
	
	String name = "abc";
	char [] result = new char[name.length()];
	
	
	int[] visited = new int[name.length()];
	int level =0;
	//printPermutation(name,result,visited,level);
	
	findSolution(name,result,visited,level); 
	
}

private static boolean findSolution(String name, char[] result, int[] visited, int level) {
	if(level== name.length()) {
		for(int i=0;i<result.length;i++)
			System.out.print(result[i]);
		System.out.println();
		return true;
	}
	else {
		for(int index=0;index<name.length();index++) {
			if(isValid(visited,index)) {
				level=	applyValue(visited,result,level,index,name);
				findSolution(name,result,visited,level);
				level=	removeValue(visited,result,level,index,name);
			}
		}
		return false;
	}
	
}

private static int removeValue(int[] visited, char[] result, int level, int index, String name) {
	visited[index]= visited[index]-1;
	level--;
	return level;
}

private static int applyValue(int[] visited, char[] result, int level,int index, String name) {
	visited[index]= visited[index]+1;
	result[level]= name.charAt(index) ;
	level++;
	
	return level;
}

private static boolean isValid(int[] visited, int i) {
	if(visited[i]!=0)
	return false;
	return true;
}

private static void printPermutation(String name, char[] result, int[] visited, int level) {
	if(level== name.length()) {
		for(int i=0;i<result.length;i++)
			System.out.print(result[i]);
		System.out.println();
		return;
	}
	else {
		for(int i=0;i<name.length();i++) {
			if(visited[i]==0)
				continue;
			else {
				visited[i]--;
				result[level]= name.charAt(i);
				printPermutation(name, result, visited, level+1);
				visited[i]++;
			}
		}
	}
}
}
