package BST;

public class NodeTree {
	private NodeTree left,right;
	private int data;
	
	public NodeTree(int data) {
		this.data = data;
		left=right=null;
	}

	public NodeTree getLeft() {
		return left;
	}

	public void setLeft(NodeTree left) {
		this.left = left;
	}

	public NodeTree getRight() {
		return right;
	}

	public void setRight(NodeTree right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	

}
