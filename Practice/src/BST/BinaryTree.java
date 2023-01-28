package BST;

import java.util.Stack;

public class BinaryTree {
	private NodeTree root;

	public BinaryTree() {
		root = null;
	}

	public boolean insert(int data) 
	{
		NodeTree newnode = new NodeTree(data);

		if (newnode == null)
			return false;

		if (root == null) 
		{
			root = newnode;
			return true;
		}

		NodeTree temp = root;

		while(true)
		{
			if (data == temp.getData())
				return false;

			if (data < temp.getData()) 
			{
				if (temp.getLeft() == null) {
					temp.setLeft(newnode);
					return true;
				}
				temp = temp.getLeft();	
			}
			else
			{
				if(temp.getRight()==null)
				{
					temp.setRight(newnode);
					return true;
				}
				temp=temp.getRight();
			}
		}
	}

	public NodeTree getRoot() {
		return root;
	}

	public void preorderRecursive(NodeTree root)
	{
		if(root==null)
		{
			return ;
		}
		
		System.out.print(root.getData()+" ");
		preorderRecursive(root.getLeft());
		preorderRecursive(root.getRight());
		
	}
	
	public  void inorderRecursive(NodeTree root)
	{
		if(root==null)
		{
			return;
		}
		inorderRecursive(root.getLeft());
		System.out.print(root.getData()+" ");
		inorderRecursive(root.getRight());
		
	}
	
	public void postorderRecursive(NodeTree root)
	{
		if(root==null)
		{
			return;
		}
		postorderRecursive(root.getLeft());
		postorderRecursive(root.getRight());
		System.out.print(root.getData()+" ");
	}
	public Integer getMax()
	{
		if(root==null)
			return null;
		
		NodeTree temp=root;
		while(temp.getRight()!=null)
		{
			temp=temp.getRight();
		}
		
		return temp.getData();
	}
	
	public Integer getMin()
	{
		if(root==null)
			return null;
		
	NodeTree temp=root;
	while(temp.getLeft()!=null)
	{
		temp=temp.getLeft();
	}
	return temp.getData();
	}
	
	public void preOrder()
	{	
		if(root==null)
			return;
		
		Stack<NodeTree> stack=new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty())
		{
			NodeTree temp=stack.pop();
			System.out.print(temp.getData()+" ");
			if(temp.getRight()!=null)
			{
				stack.push(temp.getRight());
			}
			if(temp.getLeft()!=null)
			{
				stack.push(temp.getLeft());
			}
		}
	}
	
	public void inOrder()
	{
		if(root==null)
			return;
		
		Stack<NodeTree> stack=new Stack<>();
		NodeTree temp=root;
		
		while(temp!=null || !stack.isEmpty())
		{
			while(temp!=null)
			{
				stack.push(temp);
				temp=temp.getLeft();
			}
			temp=stack.pop();
			System.out.print(temp.getData()+" ");
			temp=temp.getRight();
			
		}
	}
	
	public void postOrder()
	{
		if(root==null)
			return;
		
		Stack<NodeTree> s1=new Stack<>();
		Stack<NodeTree> s2=new Stack<>();
		s1.push(root);
		while(!s1.isEmpty())
		{
			NodeTree temp=s1.pop();
			s2.push(temp);
			if(temp.getLeft()!=null)
			{
				s1.push(temp.getLeft());
			}
			if(temp.getRight()!=null)
			{
				s1.push(temp.getRight());
			}
		}
		while(!s2.isEmpty())
		{
			System.out.print(s2.pop().getData()+" ");
			
		}
	}
	public boolean delete(int data)
	{
		if(root==null)
		{
			return false;
		}
		
		NodeTree parent=root,del=root;
		
		while(del.getData()!=data)
		{
			parent=del;
			
			if(data<del.getData())
			{
				del=del.getLeft();
			}
			else
			{
				del=del.getRight();
			}
			
			if(del==null)
				return false;
		}
		
		while(true)
		{
			if(del.getLeft()==null && del.getRight()==null)//for terminal node
			{
				if(del==root)
				{
					root=null;
					return true;
				}
				if(del==parent.getLeft())
				{
					parent.setLeft(null);
				}
				else
				{
					parent.setRight(null);
				}
				return true;
			}
			
			if(del.getLeft()!=null)//for non terminal node
			{
				NodeTree max=del.getLeft();
				parent=del;
				
				while(max.getRight()!=null)
				{
					parent=max;
					max=max.getRight();
				}
				
				int temp=del.getData();
				del.setData(max.getData());
				max.setData(temp);
				
				del=max;
			}
			else {
				NodeTree min=del.getRight();
				parent=del;
				
				while(min.getLeft()!=null)
				{
					parent=min;
					min=min.getLeft();
				}
				
				int temp=del.getData();
				del.setData(min.getData());
				min.setData(temp);
				del=min;
				
			}
				
		}
			
	}
}
