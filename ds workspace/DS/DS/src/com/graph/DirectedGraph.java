package com.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DirectedGraph {

	static class Edge {
		int src, dest;

		public Edge(int src, int dest) {
			super();
			this.src = src;
			this.dest = dest;
		}

	}

	List<List<Integer>> adj = new ArrayList();

	public DirectedGraph(List<Edge> edges) {

		for (int i = 0; i < edges.size(); i++) {

			adj.add(i, new ArrayList<>());
		}

		for (Edge current : edges) {
			adj.get(current.src).add(current.dest);

		}
	}

	public static void main(String[] args) {
		List<Edge> edges = Arrays.asList(new Edge(0, 1), new Edge(0, 2), new Edge(2, 1), new Edge(1, 2), new Edge(3, 2),
				new Edge(4, 5), new Edge(5, 4));

		DirectedGraph g = new DirectedGraph(edges);

		int n = g.adj.size();
		boolean[] discoverd = new boolean[n];

		// by for loop and this is standard way
		// bfs(g,0,discoverd);

		// by for each
		// discoverd = new boolean[n];
		// bfs1(g, 0, discoverd);

		// To see bfs for all node(here 5 node are there)
//		for(int i=0;i<=5;++i) {
//			discoverd = new boolean[n];
//			bfs1(g, i, discoverd);
//			System.out.println();};

		// To see dfs for all node(here 5 node are there)
//		for (int i = 0; i <= 5; ++i) {
//			discoverd = new boolean[n];
//			dfs(g, i, discoverd);
//			System.out.println();
//		}
		/*
		 * //Recursive call int v =0; Queue<Integer> q = new LinkedList(); q.add(v);
		 * discoverd[v] = true; bfrR(g,q,discoverd);
		 */
		
		
		  //Recursive call for DFS
		int v =0;
		Stack<Integer> s = new Stack();
		s.add(v);
		  discoverd[v] = true; 
		  dfrR(g,s,discoverd);
		 

		// printGraph(g);
	}

	private static void dfrR(DirectedGraph g, Stack<Integer> s, boolean[] discoverd) {
		if(s.isEmpty())return;
		int v =s.pop();
		System.out.print(v + " ");
		for(int u : g.adj.get(v)) {
			if(discoverd[u]==false) {
				s.add(u);
				discoverd[u]=true;
			}
		}
		dfrR(g,s,discoverd);
	}

	private static void dfs(DirectedGraph g, int v, boolean[] discoverd) {

		Stack<Integer> s = new Stack<>();
		s.add(v);
		discoverd[v] = true;
		while (!s.isEmpty()) {
			v = s.pop();
			System.out.print(v + " ");
			for (int u : g.adj.get(v)) {
				if (discoverd[u] == false) {
					s.add(u);
					discoverd[u] = true;
				}
			}
		}
	}

	private static void bfrR(DirectedGraph g, Queue<Integer> q, boolean[] discoverd) {

		if (q.isEmpty())
			return;

		Integer v = q.poll();
		System.out.print(v + " ");
		for (int u : g.adj.get(v)) {
			if (discoverd[u] == false) {
				q.add(u);
				discoverd[u] = true;
			}
		}
		bfrR(g, q, discoverd);

	}

	private static void bfs(DirectedGraph g, int v, boolean[] discoverd) {
		Queue<Integer> q = new LinkedList();
		q.add(v);
		discoverd[v] = true;
		while (!q.isEmpty()) {
			v = q.poll();
			System.out.print(v + " ");

			for (int i = 0; i < g.adj.get(v).size(); i++) {
				int u = g.adj.get(v).get(i);
				if (discoverd[u] == false) {
					q.add(u);
					discoverd[u] = true;
				}
			}

		}
	}

	private static void bfs1(DirectedGraph g, int v, boolean[] discoverd) {
		Queue<Integer> q = new LinkedList();
		q.add(v);
		discoverd[v] = true;

		while (!q.isEmpty()) {
			v = q.poll();
			System.out.print(v + " ");
			for (int u : g.adj.get(v)) {
				if (discoverd[u] == false) {
					q.add(u);
					discoverd[u] = true;

				}
			}

		}
	}

	private static void printGraph(DirectedGraph g) {
		int src = 0;
		int n = g.adj.size();

		while (src < n) {

			for (int dest : g.adj.get(src))
				System.out.println("src " + src + " dest " + dest);
			System.out.println();
			src++;

		}

	}

}
