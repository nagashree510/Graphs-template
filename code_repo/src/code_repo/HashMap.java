package code_repo;
import java.util.*;
public class HashMap {

	public static void main(String[] args) {
		// 	To populate frequency
		int a[];
        HashMap<Integer,Integer> map=new HashMap<>();
        
		for(int i=0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(0,a[i])+1);
        }

		 for (Map.Entry<Integer,Integer> entry : map.entrySet()) 
			 
	            System.out.println("Key = " + entry.getKey() +
	                             ", Value = " + entry.getValue());
	    }
	}
	

}
