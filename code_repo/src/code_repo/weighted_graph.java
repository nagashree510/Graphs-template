package code_repo;

import java.util.*;

class pair{
	int node;
	int wt;
	pair(int node,int wt){
		this.node=node;
		this.wt=wt;
	}
}
 public class weighted_graph {
	 
 public static void main(String[] args) {
		//given 2D-Array
	 int n=0;
	 int[][] arr=new int[n][n];
	 
	 ArrayList<ArrayList<pair>> graph=new ArrayList<>();
	 
	 for(int i=0;i<n;i++) {
		 graph.add(new ArrayList<>());
	 }
	 for(int i=0;i<n;i++) {
		 int sr=arr[i][0];
		 int dest=arr[i][1];
		 int wt=arr[i][2];
		 graph.get(sr).add(new pair(dest,wt));
		 // undirected graph
		 // graph.get(dest).add(new pair(sr,wt)); 
	 }
	
	 
 }
}
