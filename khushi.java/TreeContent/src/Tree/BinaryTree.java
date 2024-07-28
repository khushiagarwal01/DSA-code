package Tree;

import java.util.*;

public class BinaryTree {

    Scanner sc = new Scanner(System.in);
    
    public class Node {
        int data;
        Node left;
        Node right;
    }
    
    private Node root;

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = bt.createroot();
        bt.display();
       System.out.print( bt.max());
        
    }

    public BinaryTree() {
        // Constructor logic if needed
    	root=createroot();
    }

    private Node createroot() {
        int item = sc.nextInt();
        System.out.println("Creating node with data: " + item);  // Debug statement
        Node nn = new Node();
        nn.data = item;
        boolean hlc = sc.nextBoolean();
        if (hlc) {
            System.out.println("Creating left child for node: " + item);  // Debug statement
            nn.left = createroot();
        }
        boolean hrc = sc.nextBoolean();
        if (hrc) {
            System.out.println("Creating right child for node: " + item);  // Debug statement
            nn.right = createroot();
        }
        return nn;
    }
    public void display() {
    	 display(root);
    }

    private void display(Node nn) {
        if (nn == null) {
              // Debug statement
            return;
        }
        String s = "";
        s = s + nn.data;
        s = "<--" + s + "-->";
        if (nn.left != null) {
            s = nn.left.data + s;
        } else {
            s = "." + s;
        }
        if (nn.right != null) {
            s = s + nn.right.data;
        } else {
            s = s + ".";
        }
        System.out.println(s);  // Debug statement
        display(nn.left);
        display(nn.right);
    }
    public int max() {
    	return max(root);
    }
    private int max(Node node) {
    	if(node==null) {
    		return Integer.MIN_VALUE;
    	}
    	int l=max(node.left);
    	int r=max(node.right);
    	return Math.max(node.data, Math.max(l, r));
    	
    	
    	
    }
}