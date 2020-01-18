package com.BinaryTree.ExpressionTree;

class Node{
	
	char value;
	Node left,right;
	
	Node(char item){
		value=item;
		left=right=null;
	}
}

public class ExpressionTree {
	
	boolean isOperator(char c) {
		
		if(c=='+' || c=='-' || c=='*' || c=='/' || c=='^')
			return true;
		return false;
	}
	
	void  inorder(Node t) {
		
		if(t!=null) {
			
			inorder(t.left);
			System.out.println(t.value+" ");
			inorder(t.right);
		}
	}
	
	//Node onstructTree

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
