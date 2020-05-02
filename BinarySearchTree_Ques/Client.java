package BinarySearchTree_Ques;

import BinarySearchTree_Ques.Binary_Search_Tree.LinkedList;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Search_Tree tree = new Binary_Search_Tree();
		tree.add(50);
		tree.add(25);
		tree.add(75);
		tree.add(12);
		tree.add(37);
		tree.add(62);
		tree.add(87);
//		tree.add(90);
//		tree.add(100);
//		tree.add(110);
		
		
//		tree.display();
//		System.out.println(tree.isBalanced());

		// Constructing BST from an array 		
//		int[] arr = {5,10,15,23,34,45,55,68};
//		Binary_Search_Tree tree = new Binary_Search_Tree(arr);
		
		LinkedList list = tree.BSTtoLL();
		list.display();
		
	}

}
