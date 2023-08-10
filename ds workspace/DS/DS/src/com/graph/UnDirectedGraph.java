package com.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Non Directional
public class UnDirectedGraph {

	List<Edge1> edges;
	
	List<List<Integer>> adj= new ArrayList<>();;
	
	public UnDirectedGraph(List<Edge1> edges) {
		
		for(int i=0;i<edges.size()*2;i++) {
		   adj.add(i,new ArrayList<Integer>());
		}
		
		
		for(Edge1 edge : edges) {
			adj.get(edge.src).add(edge.dest);

			// for non directional graph
			adj.get(edge.dest).add(edge.src);
		}
	}
	
	public static void main(String[] args) {
		List<Edge1> edges = Arrays.asList(new Edge1(0,1),new Edge1(0,2),
				new Edge1(1,3)
				,new Edge1(3,2),
				new Edge1(4,5)
				);
		
		UnDirectedGraph g = new UnDirectedGraph(edges);
		printGraph(g);
	}

	private static void printGraph(UnDirectedGraph g) {
		
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
