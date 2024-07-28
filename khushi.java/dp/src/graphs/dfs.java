package graphs;

import java.util.HashSet;
import java.util.Stack;

public class dfs {

	public boolean dfs(int src,int des) {
		Stack<Integer> stack=new Stack<>();
		HashSet<Integer> visited=new HashSet<>();
		stack.push(src);
		while(!stack.isEmpty()) {
			int r=stack.pop();
			if(visited.contains(r)) {
				continue;
			}
			visited.add(r);
			if(r==des) {
				return true;
			}
			for(int nbrs:map.get(r).keySet()) {
				if(!visited.contains(nbrs)) {
					stack.push(nbrs);
				}
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
