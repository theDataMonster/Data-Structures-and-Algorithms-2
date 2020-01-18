package com.BinaryTree.Problems;

public class BinaryTreeSimple {
	
	Node root;
	
	BinaryTreeSimple(int key){
		
		root=new Node(key);
	}
	
	public BinaryTreeSimple() {
		// TODO Auto-generated constructor stub
		root=null;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeSimple tree=new BinaryTreeSimple();
		
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		
		tree.root.left.left=new Node(4);

	}

}
class Node{
	
	int key;
	Node left,right;
	
	public Node(int item) {
		
		key=item;
		left=right=null;
	}
}
