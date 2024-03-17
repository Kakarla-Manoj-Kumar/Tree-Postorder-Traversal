package treePostorderTraversal;

public class Runner {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insert(9);
		tree.insert(24);
		tree.insert(8);
		tree.insert(10);
		tree.insert(7);
		tree.insert(1);
		
		tree.postOrder();

	}

}
