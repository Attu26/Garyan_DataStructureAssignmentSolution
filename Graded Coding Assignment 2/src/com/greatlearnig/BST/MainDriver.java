package com.greatlearnig.BST;

public class MainDriver {
	
		SkewedNode node;
		SkewedNode prevNode = null;
		SkewedNode rootNode = null;
		
		void modifyBTTSkewed(SkewedNode root) {
			
			if (root == null) 
				return;
				modifyBTTSkewed(root.left);
				SkewedNode rightNode = root.right;
			
			if (rootNode == null) {
				rootNode = root;
				root.left = null;
				prevNode = root;		
			}
			else {
				prevNode.right = root;
				root.left = null;
				prevNode = root;	}
			
			modifyBTTSkewed(rightNode);
			}
			
		void traverseRightSkewed(SkewedNode root) {
			if (root == null) 
				return;
				
			System.out.print("  "+ root.val + " ");
			traverseRightSkewed(root.right); }
	public static void main(String[] args) {
			System.out.println("The new order is as below <=");
			MainDriver tree = new MainDriver();
			
			tree.node = new SkewedNode(50); 
			
			tree.node.left = new SkewedNode(30);
			
			tree.node.right = new SkewedNode(60); 
			
			tree.node.left.left = new SkewedNode(10);
			
			tree.node.right.left= new SkewedNode(55);
			tree.modifyBTTSkewed(tree.node);
			tree.traverseRightSkewed(tree.rootNode);
		
	

}

}