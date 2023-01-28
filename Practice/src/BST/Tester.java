package BST;

public class Tester {

	public static void main(String[] args) {
		BinaryTree bst=new BinaryTree();
		bst.insert(50);
		bst.insert(20);
		bst.insert(10);
		bst.insert(5);
		bst.insert(15);
		bst.insert(45);
		bst.insert(30);
		bst.insert(90);
		bst.insert(85);
		bst.insert(75);
		bst.insert(100);
		bst.insert(95);
		bst.insert(120);
		
		bst.preorderRecursive(bst.getRoot());
		System.out.println();
		bst.inorderRecursive(bst.getRoot());
		System.out.println();
		bst.postorderRecursive(bst.getRoot());
		System.out.println();
		System.out.println("-------");
		bst.preOrder();
		System.out.println();
		bst.inOrder();
		System.out.println();
		bst.postOrder();
		System.out.println();
		bst.delete(20);
		bst.preOrder();
		System.out.println("--------------------------");
		System.out.println("Max: "+bst.getMax());
		System.out.println("Min: "+bst.getMin());
		
		bst.delete(50);
		bst.preOrder();
	}

}
