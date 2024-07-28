package graphs;

import java.util.HashSet;
import java.util.LinkedList;

public boolean class hascycle {

	LinkedList<Integer> qq=new LinkedList<>();
	HashSet<Integer> visited=new HashSet<>();
	for(int src:map.keySet()) {
		if(visited.contains(src)) {
			continue;
		}
	
	qq.add(src);
	while(!qq.isEmpty()) {
		int r=qq.remove();

		if(visited.contains(r)) {
			return true;
		}
		
		visited.add(r);
		System.out.print(r);
		for(int nbrs:map.get(r).keySet()) {
			if(!visited.contains(nbrs)) {
				qq.add(nbrs);
			}
		}
	}
	}
	return false;
}
}