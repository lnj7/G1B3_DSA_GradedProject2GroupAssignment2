package com.glearning.bst;

public class SkewedTree {
	public static Node root;
	static Node prevNode = null;
	static Node mainNode = null;

	static class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static void bstToSkewed(Node root, int key) {
		if (root == null) {
			return;
		}

		if (key > 0) {
			bstToSkewed(root.right, key);
		} else {
			bstToSkewed(root.left, key);
		}

		Node rightNode = root.right;
		Node leftNode = root.left;

		if (mainNode == null) {
			mainNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		if (key > 0) {
			bstToSkewed(leftNode, key);
		} else {
			bstToSkewed(rightNode, key);
		}
	}

	public static void printTree(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		printTree(root.right);
	}

}
