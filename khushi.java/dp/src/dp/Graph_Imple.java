package dp;
import java.util.*;

public class Graph_Imple {
  HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
	public Graph_Imple(int v) {
		
		for(int i=1;i<=v;i++) {
			map.put(i,new HashMap<>());
		}
		
	}
	public void Addedge(int v1,int v2,int cost) {
		map.get(v1).put(v2,cost);
		map.get(v2).put(v1, cost);
	}
	public boolean containedge(int v1,int v2) {
		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
	}
	public boolean containvertex(int v1) {
		return map.containsKey(v1);
	}
	public int numofedge() {
		int sum=0;
		for(int key:map.keySet()) {
			sum=sum+map.get(key).size();
		}
		return sum/2;
	}
	
	public void removeedge(int v1,int v2) {
		if(containedge(v1,v2)) {
			map.get(v1).remove(v2);
			map.get(v2).remove(v1);
		}
	}
	public void removevertex(int v1) {
		for(int key:map.get(v1).keySet()) {
			map.get(key).remove(v1);
		}
		map.remove(v1);
	}
	
	public void display() {
		for(int key:map.keySet()) {
			System.out.print(key+"-"+ map.get(key));
		}
	}
	public boolean haspath1(int src,int des) {
		HashSet<Integer> visited=new HashSet<>();
		return hasPath(src,des,visited);
	}
	public boolean hasPath(int src,int des,HashSet<Integer> visited) {
		if(src==des) {
			return true;
		}
		visited.add(src);
		for(int paths:map.get(src).keySet()) {
			if(!visited.contains(paths)) {
				boolean ans=hasPath(paths,des,visited);
				if(ans) {
					return ans;
				}
			}
		}
		visited.remove(src);
		return false;
	}
	public void printallpath(int src,int des,HashSet<Integer> visited,String ans) {
		if(src==des) {
			System.out.println(ans+src);
			return;
		}
		visited.add(src);
		for(int path:map.get(src).keySet()) {
			if(!visited.contains(path)) {
				printallpath(path,des,visited,ans+src+" ");
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Graph_Imple graph=new Graph_Imple(5);
		 graph.Addedge(1, 2, 10);
	        graph.Addedge(2, 3, 20);
	        graph.Addedge(3, 4, 30);
	        graph.Addedge(4, 5, 40);
//	        graph.display();
//	        graph.removevertex(3);
//	        boolean pathexist=graph.haspath1(1, 2);
//	        System.out.print(pathexist);
	        graph.printallpath(1, 4, new HashSet<>(), "");
	        
	}
	
	
	
	
    }
