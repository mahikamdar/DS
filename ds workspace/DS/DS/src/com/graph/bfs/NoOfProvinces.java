package com.graph.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NoOfProvinces {
	List<List<Integer>> adj = new ArrayList();
	

	public NoOfProvinces(List<Edge> edges, int n) {
		
		for(int i=0;i<n;i++)
			adj.add(i, new ArrayList<Integer>());
		
		for(Edge edge : edges ) {
			adj.get(edge.src).add(edge.dest);
			adj.get(edge.dest).add(edge.src);
		}
		
			
	}

	public static void main(String[] args) {
		Edge e1 = new Edge(0,1);
		Edge e2 = new Edge(1,2);
		Edge e3 = new Edge(2,3);
	//	Edge etest = new Edge(3,4);
		Edge e4 = new Edge(4,5);
		Edge e5 = new Edge(5,6);
		Edge e6 = new Edge(7,8);
		List<Edge> l = new ArrayList();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		//l.add(etest);
		
		NoOfProvinces graph = new NoOfProvinces(l, 9);
		
		findProvinces(graph);
	}

	private static void findProvinces(NoOfProvinces graph) {
		boolean visited [] = new boolean[9];
		int count=0;
		for(int v=0;v<visited.length;v++) {
			if(visited[v]==false) {
			bfs(visited, graph,v);
			count++;
			}
		}
		System.out.println(count);
	}

	private static void bfs(boolean[] visited, NoOfProvinces graph,int v) {
		Queue<Integer> q = new LinkedList();
		
		q.add(v);
		visited[v]= true;
		
		while( q.size()>0) {
			v = q.poll();
			
			for( int i=0;i<graph.adj.get(v).size();i++) {
			
				int u = graph.adj.get(v).get(i);
				if(visited[u]==false) {
					q.add(u);
					visited[u]=true;
				}
				
			}
		}
		
		
	}
	
}
