package Tree;

import java.util.*;

public class BinaryTree {

	Scanner sc=new Scanner (System.in);
	
	public class Node{
		int data;
		Node left;
		Node right;
	}
	private Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		BinaryTree bt=new BinaryTree();
		bt.root=bt.createroot();
		bt.display(bt.root);
	}
		public BinaryTree() {
		this.root=createroot();

	}
	private Node createroot() {
		int item=sc.nextInt();
		Node nn=new Node();
		nn.data=item;
		boolean hlc=sc.nextBoolean();
		if(hlc==true) {
			nn.left=createroot();
		}
		boolean hrc=sc.nextBoolean();
		if(hrc==true) {
			nn.right=createroot();
		}
		return nn;
	}
	public void display(Node nn) {
		if(nn==null) {
			return;
		}
		String s="";
		s=s+nn.data;
		s="<--" + s + "-->";
		if(nn.left!=null) {
			s=nn.left.data + s;
		}
		else {
			s="."+s;
		}
		if(nn.right!=null) {
			s=s+nn.right.data ;
		}
		else {
			s=s+".";
		}
		System.out.println(s);
		display(nn.left);
		display(nn.right);
	}

}
