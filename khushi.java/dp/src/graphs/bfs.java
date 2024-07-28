package graphs;

import java.util.HashSet;
import java.util.LinkedList;

public class bfs {

	
	public boolean bfs(int src,int des) {
		LinkedList<Integer> qq=new LimkedList<>();
		HashSet<Integer> visited=new HashSet<>();
		qq.add(src);
		while(!qq.isEmpty()) {
			int r=qq.remove();
	
			if(visited.contains(r)) {
				continue;
			}
			visited.add(r);
			if(r==des) {
				return true;
			}
			for(int nbrs:map.get(r).keySet()) {
				if(!visited.contains(nbrs)) {
					qq.add(nbrs);
				}
			}
		
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
