package BinaryTree_Ques;
import java.util.*;
public class Binary_Tree {
		private class Node{
			int data;
			Node left;
			Node right;
		
			Node(int data, Node left, Node right){
				this.data = data;
				this.left = left;
				this.right = right;
			}
		}

		private Node root;
		int size;

		Binary_Tree(){
			Scanner s = new Scanner(System.in);
			this.root = this.takeInput(s,null,false);
		}


		private Node takeInput(Scanner s, Node parent, boolean isleftorright){
			if (parent == null) {
				System.out.println("Enter the data for root node");
			}
			else{
				if(isleftorright){
					System.out.println("Enter the Data for left child of " + parent.data);
				}
				else{
					System.out.println("Enter the Data for right child of " + parent.data);
				}
			}

			int data = s.nextInt();
			Node node = new Node(data, null, null);
			this.size++;

			boolean choice = false;
			System.out.println("Do you have left child for " + node.data);
			choice = s.nextBoolean();
			if(choice){
				node.left = this.takeInput(s, node, true);
			}

			choice = false;
			System.out.println("Do you have right child for " + node.data);
			choice = s.nextBoolean();
			if(choice){
				node.right = this.takeInput(s, node, false);
			}

			return node;
		}


//////////////////////////////////size of tree
		public int size2()
		{
			return this.size2(this.root);


		}
		private int size2(Node node)
		{
			if (node == null) {
				return 0;
			}

			int lsize = this.size2(node.left);
			int rsize = this.size2(node.right);
			return lsize + rsize + 1;
		}
////////////////////////////////////////pre order traversal
		public void preOrder(){
			this.preOrder(this.root);
			System.out.println();
		}
		private void preOrder(Node node){

			if (node == null) {
				return;
			}
			System.out.print(node.data + " ");
			preOrder(node.left);
			preOrder(node.right);
		}
/////////////////////////////////////////////////In order traversal
		public void inOrder(){
			this.inOrder(this.root);
			System.out.println();
		}
		private void inOrder(Node node){

			if (node == null) {
				return;
			}
		
			inOrder(node.left);
			System.out.print(node.data + " ");
			inOrder(node.right);
		}
//////////////////////////////////////////////////Post order
		public void postOrder(){
			this.postOrder(this.root);
			System.out.println();
		}
		private void postOrder(Node node){

			if (node == null) {
				return;
			}
		
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data + " ");
		}
		
////////////////////////////// Check if Binary tree is Binary Search tree
		public boolean isBST() {
			return isBST(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		}
		
		private boolean isBST(Node node, int min, int max) {
			if(node == null) {
				return true;
			}
			
			if(node.data < min || node.data > max) {
				return false;
			}
			else if(!isBST(node.left , min , node.data)) {
				return false;
			}
			else if(!isBST(node.right, node.data, max)) {
				return false;
			}
			else {
				return true;
			}
		}
				
//////////////////////////Mirror the the tree	
		public void mirror()
		{
			this.mirror(this.root);
		}
		private void mirror(Node node){
			if (node==null) {
				return;
			}
			Node temp = node.left;
			node.left = node.right;
			node.right = temp;
			this.mirror(node.left);
			this.mirror(node.right);
		}
////////////////////////////////////////////////Level order traversal		
		public void level_Order()
		{
			this.level_Order(this.root);
		}
		private void level_Order(Node node){
			Queue<Node> q = new LinkedList<Node>();
			q.add(node);
			while(!q.isEmpty())
			{
				Node rv = q.remove();
				System.out.println(rv.data);
				if (rv.left!=null) {
					q.add(rv.left);
				}
				if (rv.right!=null) {
					q.add(rv.right);
				}
			}
		}
		
/////////////////Contruct Tree from In-order and pre-order arrays
		public Binary_Tree(int [] pre , int [] in) {
			this.root = this.Construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
		}
		
		private Node Construct(int[] pre, int presi, int preei, int[] in, int insi, int inei) {
			if(presi > preei || insi > inei) {
				return null;
			}
			
			Node node = new Node(pre[presi], null, null);
			this.size++;
			
			int position_root = -1;
			for(int i = insi; i <= inei;i++) {
				if(in[i] == node.data) {
					position_root = i;
					break;
				}
			}
			
			int lsi = position_root - insi;
			
			node.left = this.Construct(pre, presi +1 , preei, in, insi, position_root - 1);
			node.right = this.Construct(pre, presi + lsi +1, preei, in, position_root +1, inei);
			return node;
		}

		public void max() {
			int max = this.max(this.root);
			System.out.println(max);
		}
		
		private int max(Node node) {
			if(node==null)
			{
				return Integer.MIN_VALUE;
			}
			int lmax = this.max(node.left);
			int rmax = this.max(node.right);
			return Math.max(node.data, Math.max(lmax, rmax));
		}
		
		public void height()
		{
			System.out.println(this.height(this.root));
		}
		
		private int height(Node node) {
			if(node==null)
			{
				return -1;
			}
			
			int lh = this.height(node.left);
			int rh = this.height(node.right);
			return Math.max(lh, rh) + 1;
		}
		
		public int diameter() {
			return this.diameter(this.root);
		}
		
		private int diameter(Node node) {
			if (node==null) {
				return 0 ;
			}
			// For passing through root node
			int f1 = this.height(node.left) + this.height(node.right) + 2;
			int f2 = this.diameter(node.left);
			int f3 = this.diameter(node.right);
			return Math.max(f1, Math.max(f2,  f3));
			
		}
		
		public void display()
		{
			this.display(this.root);
		}

		private void display(Node node) {
			if (node.left!=null) {
				System.out.print(node.left.data + " -> ");
			}
			else{
				System.out.print( "END -> ");
			}

			System.out.print(node.data);

			if (node.right!=null) {
				System.out.print(" <- " + node.right.data);
			}
			else{
				System.out.print(" <- END");
			}
			System.out.println();

			if (node.left!=null) {
				this.display(node.left);
			}

			if (node.right!=null) {
				this.display(node.right);
			}

		}

	}

