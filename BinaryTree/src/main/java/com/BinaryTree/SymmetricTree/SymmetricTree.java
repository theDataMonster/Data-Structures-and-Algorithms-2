package com.BinaryTree.SymmetricTree;

class Node{
	
	int key;
	Node left,right;
	
	Node(int item){
		key=item;
		left=right=null;
	}
}

public class SymmetricTree {
	
	Node root;
	
	boolean isMirror(Node node1,Node node2) {
		
		if(node1==null && node2==null) {
			
			return true;
		}
		
		if(node1!=null && node2!=null && node1.key==node2.key) {
			
			return (isMirror(node1.left,node2.right) && isMirror(node1.right,node2.left));
		}
		
		return false;
	}
	
	boolean isSymmetric(Node node) {
		
		return isMirror(root,root);
	}
	
	public static void main(String[] args) {
		
		SymmetricTree tree=new SymmetricTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(2);
		tree.root.left.left=new Node(3);
		tree.root.left.right=new Node(4);
		tree.root.right.left=new Node(4);
		tree.root.right.right=new Node(3);
		
		if(tree.isSymmetric(tree.root))
			System.out.println("Symmetric");
		else
			System.out.println("Not symmetric");
		
		
		
		
	}

}
