package com.graph;

import java.util.ArrayList;
import java.util.List;

public class WeightedGraph {

	List<WeightEdge> edges;
	List<List<Node>> adj= new ArrayList<>();
	public WeightedGraph(List<WeightEdge> edges) {
		
		for(int i=0; i<edges.size();i++) 
			adj.add(i, new ArrayList<Node>());
		
		for(WeightEdge edge : edges) {
			adj.get(edge.src).add(new Node(edge.dest,edge.weight));
		}
			
			
		
	}
	
	public static void main(String[] args) {
		List<WeightEdge>	eds = new ArrayList();
		eds.add(new WeightEdge(0,1,6) );
		eds.add(new WeightEdge(1,2,7) );
		eds.add(new WeightEdge(2,0,5) );
		eds.add(new WeightEdge(2,1,4) );
		eds.add(new WeightEdge(3,2,10) );
		eds.add(new WeightEdge(4,5,3) );
		eds.add(new WeightEdge(5,4,1) );
		
		WeightedGraph g = new WeightedGraph(eds);
		printGraph(g);
	}

	private static void printGraph(WeightedGraph g) {
		int n =g.adj.size();
		int src =0;
		
		while(src< n) {
			
			for(Node node : g.adj.get(src)) {
				System.out.println("src "+src+" dest "+ node.value+" weight "+ node.weight);
			}
			System.out.println();
			src++;
		}
		
	}

	
}
