package graphs;

import java.util.HashSet;
import java.util.LinkedList;

public class bft {

	public boolean bft(int src,int des) {
		for(int src:map.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
		LinkedList<Integer> qq=new LimkedList<>();
		HashSet<Integer> visited=new HashSet<>();
		qq.add(src);
		while(!qq.isEmpty()) {
			int r=qq.remove();
	
			if(visited.contains(r)) {
				continue;
			}.
			
			visited.add(r);
			System.out.print(r);
			for(int nbrs:map.get(r).keySet()) {
				if(!visited.contains(nbrs)) {
					qq.add(nbrs);
				}
			}
		
		}
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
