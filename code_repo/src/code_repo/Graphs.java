package code_repo;

import java.util.*;

public class Graphs {

	public static void main(String[] args) {
		
	}
//Directed Graphs/given in form of list or matrix 
	public  ArrayList<ArrayList<Integer>> createGraphfrommatrix(int n,int mat[][]) {
		//n number of nodes
		//e-mat.length-number of edges
		
		ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
		for(int i=0;i<n;i++) {
			graph.add(new ArrayList<>());
		}
		
		for(int []i:mat) {
			int source=i[0];
			int dest=i[1];
			
			graph.get(source).add(dest);
			
			//in case of undirected graph
			
		   //graph.get(dest).add(source);
			
		}
		
		return graph;
		
	}
	public  ArrayList<ArrayList<Integer>> createGraphfromlist(int n,List<List<Integer>>a) {
		
		ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			graph.add(new ArrayList<>());
		}
		for(int i=0;i<a.size();i++) {
			for(int x:a.get(i)) {
				graph.get(i).add(x);
				graph.get(x).add(i);
			}
		}
		
		
		
		return graph;
	}
	
}
