package com.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {

	
	static class Edge{
		int src, dest;

		public Edge(int src, int dest) {
			super();
			this.src = src;
			this.dest = dest;
		}
		
	}
	
	List<List<Integer>> adj = new ArrayList();
	
	public Graph(List<Edge> edges) {
		
		for(int i=0;i<edges.size();i++) {
			
			adj.add(i,new ArrayList<>());
		}
		
		for(Edge current : edges) {
			adj.get(current.src).add(current.dest);
		}
	}
	
	public static void main(String[] args) {
		List<Edge> edges = Arrays.asList(new Edge(0,1),new Edge(0,2),
				new Edge(2,1),
				new Edge(1,2)
				,new Edge(3,2)
				);
		
		Graph g = new Graph(edges);
		
		printGraph(g);
	}

	private static void printGraph(Graph g) {
		int src =0;
		int n = g.adj.size();
		
		while(src<n) {
			
			for(int dest: g.adj.get(src)) 
				System.out.println("src "+src+" dest "+dest );
			System.out.println();
				src++;
			
		}
		
	}
	
	
}
