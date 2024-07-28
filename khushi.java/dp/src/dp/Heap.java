package dp;

import java.util.ArrayList;

public class Heap {
  public ArrayList<Integer> data1=new ArrayList<>();

	public void add(int val) {
		data1.add(val);
		upheapify(data1.size()-1);
	}
	public void upheapify(int ci) {
		int pi=(ci-1)/2;
		if(data1.get(pi)>data1.get(ci)) {
			Swap(pi,ci);
			upheapify(pi);
			
		}
	
	}
	public void Swap(int i,int j) {
		int ith=data1.get(i);
		int jth=data1.get(j);
		data1.set(i,jth);
		data1.set(j,ith);
		
	}
	public void removeheap(int val) {
		Swap(0,data1.size()-1);
		int rv=data1.remove(data1.size()-1);
		downheapify(0);
	}
	public void downheapify(int pi) {
		int min=pi;
		int lci=2*pi+1;
		int rci=2*pi+2;
		if(lci<data1.size()-1 && data1.get(pi)>data1.get(lci)){
			min=lci;
		}
		if(rci<data1.size()-1 && data1.get(min)>data1.get(rci)) {
			min=rci;
		}
		if(min!=pi) {
			Swap(min,pi);
			downheapify(min);
		}
	}
	public int getsize() {
		return data1.size();
	}
	public  int getmin() {
		return data1.get(0);
	}
	public void display() {
		System.out.print(data1);
	}
	public static void main(String[] args) {
		Heap heap=new Heap();
		  heap.add(10);
	        heap.add(5);
	        heap.add(20);
	        heap.add(2);
//	        heap.removeheap(5);
	        heap.display();
//	        System.out.println(heap.data1);
		
	}

}
