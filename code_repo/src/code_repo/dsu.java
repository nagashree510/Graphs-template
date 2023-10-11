package code_repo;

import java.util.Arrays;

public class dsu {
    int parent[];
    int height[];
    
    dsu(int n){
    	parent=new int [n];
    	height=new int [n];
    	
    	Arrays.fill(parent,-1);
    	Arrays.fill(height, 1);
    }
    
    public int find(int n) {
    	if(parent[n]==-1)return n;
    	parent[n]=find(parent[n]);
    	return parent[n];
    }
    
    public boolean union(int a,int b) {
    	
    	int pa=find(a);
    	int pb=find(b);
    	
    	if(pa!=pb) {
    		int sa=height[a];
    		int sb=height[b];
    		if(sa>sb) {
    			parent[pb]=pa;
    		}
    		else if(sb>sa) {
    			parent[pa]=pb;
    		}
    		else {
    			parent[pb]=pa;
    			height[pa]++;
    		}
    		
    		return false;
    	}
    	
    	return true;
    }
}
