package BinaryTree_Ques;

public class Client {
	//50 true 25 true 12 false false true 39 false false true 75 true 41 false false true 87 false false
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Binary_Tree tree= new Binary_Tree();
		tree.display();
		System.out.println(tree.size2());
		System.out.println("In order traversal : ");
		tree.inOrder();
		System.out.println("Post order traversal : ");
		tree.postOrder();
		System.out.println("Pre order traversal : ");
		tree.preOrder();
		System.out.println("Max : ");
		tree.max();
		System.out.println("Height : ");
		tree.height();
		System.out.println("Diameter : " + tree.diameter());
		// Constructing tree from in order and preorder traversal
		*/
		
		int[] pre = {50,25,12,39,75,62,87};
		int[] in = {12, 25, 39, 50, 62, 75, 87};
		
		Binary_Tree trr1 = new Binary_Tree(pre, in);
		trr1.display();
		System.out.println("BST : " + trr1.isBST());
	}

}
