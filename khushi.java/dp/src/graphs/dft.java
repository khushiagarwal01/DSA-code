package graphs;

import java.util.HashSet;
import java.util.Stack;

public class dft {

	public boolean dfs(int src,int des) {
		
	
		Stack<Integer> stack=new Stack<>();
		HashSet<Integer> visited=new HashSet<>();
		for(int src:map.keySet()) {
		stack.push(src);
		while(!stack.isEmpty()) {
			int r=stack.pop();
			if(visited.contains(r)) {
				continue;
			}
			visited.add(r);
			System.out.println(r);
			for(int nbrs:map.get(r).keySet()) {
				if(!visited.contains(nbrs)) {
					stack.push(nbrs);
				}
			}
		}
		return false;
	}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

