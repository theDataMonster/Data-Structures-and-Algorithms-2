package com.BinaryTree.FoldableTree;

class Node{
	
	int data;
	Node left,right;
	
	Node(int item){
		data=item;
		left=right=null;
	}
}

public class FoldableTree {
	
	Node root;
	
	boolean isFoldable(Node node) {
		
		if(node==null) {
			return true;
		}
		
		return isFoldableUtil(node.left,node.right);
	}
	
	boolean isFoldableUtil(Node n1, Node n2) {
		
		if(n1==null && n2==null) {
			return true;
		}
		
		if(n1==null || n2==null) {
			return false;
		}
		
		return isFoldableUtil(n1.left,n2.right) && isFoldableUtil(n1.right,n2.left);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FoldableTree tree=new FoldableTree();
		
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.right.left=new Node(4);
		tree.root.left.right=new Node(5);
		
		if(tree.isFoldable(tree.root))
			System.out.println("Tree is foldable");
		else
			System.out.println("Tree is not foldable");

	}

}
