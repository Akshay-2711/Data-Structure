package StackAsLL;

public class stack
{	
	private Node head;
	
	public stack() {
		head=null;
	}
	
	public void push(int data)
	{
		Node newnode=new Node(data);
		newnode.setNext(head);
		head=newnode;
	}
	
	public int pop()
	{
		int temp=head.getData();
		head=head.getNext();
		
		return temp;
	}
	
	public int peek()
	{
		return head.getData();
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void display()
	{
		System.out.print(head.getData()+" ");
	}
}
