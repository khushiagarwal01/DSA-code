package Tree;
//import java.util.*;
//public class Binary_imple {
//	public class Node{
//		Node left;
//		Node right;
//		int val;
//	}
//	private Node root;
//	public Binary_imple() {
//		root=createTree();
//	}
//	Scanner sc =new Scanner(System.in);
//	private Node createTree() {
//		int item=sc.nextInt();
//		Node nn =new Node();
//		nn.val=item;
//		boolean hlf = sc.nextBoolean();
//		if(hlf==true) {
//			nn.left = createTree();
//		}
//		boolean hrc =  sc.nextBoolean();
//		if(hrc==true) {
//			nn.right=createTree();
//		}
//		return nn;
//		
//	}
//	public void Display() {
//		Display(this.root);
//	}
//	private void Display(Node root) {
//		String str = "";
//		str="<-"+root.val+"->";
//		if(root.left!=null) {
//			str = root.left.val+str;
//		}
//		else {
//			str="."+str;
//		}
//		if(root.right!=null) {
//			str=str+root.right.val;
//			
//		}
//		else {
//			str=str+".";
//		}
//		Display(root.left);
//		Display(root.right);
//	}
//	public static void main(String[] args) {
//		Binary_imple bt = new Binary_imple();
//		bt.createTree();
//		bt.Display();
//
//	}
//
//}

import java.util.*;

public class Binary_imple {
    public class Node {
        int data;
        Node left;
        Node right;

    }

    private Node root;

    public Binary_imple() {
        root = createtree();
    }

    Scanner sc = new Scanner(System.in);

    private Node createtree() {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.data = item;
        // hlc --> has left child..
        boolean hlc = sc.nextBoolean();
        if (hlc == true) {
            nn.left = createtree();
        }
        // hrc --> has right child
        boolean hrc = sc.nextBoolean();
        if (hrc == true) {
            nn.right = createtree();
        }
        return nn;

    }

    public void Display() {
        Display(root);
    }

    private void Display(Node nn) {
        if (nn == null) {
            return;
        }
        String s = "";
        s = "<--" + nn.data + "-->";
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
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }

    public static void main(String args[]) {
    	Scanner sc= new Scanner(System.in);
    	Binary_imple bt = new Binary_imple();
    	bt.createtree();
    	bt.Display();
    	
    }

}
