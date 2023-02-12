package com.glearning.bst;

import com.glearning.bst.SkewedTree.Node;

public class Main {

	public static void main(String[] args) {

		SkewedTree tree = new SkewedTree();
		tree.root = new Node(50);
		tree.root.left = new Node(30);
		tree.root.right = new Node(60);
		tree.root.left.left = new Node(10);
		tree.root.right.left = new Node(55);

		// For Skewed tree key = 0 (increasing order)
		int key = 0;
		tree.bstToSkewed(tree.root, key);
		tree.printTree(tree.mainNode);

	}

}
