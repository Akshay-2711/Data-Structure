package DoublyLL;

public class dll {
	private Node head;

	public dll() {
		this.head = null;
	}

	public boolean insert(int data) {
		Node newnode = new Node(data);
		if (newnode == null)
			return false;

		if (head == null) {
			head = newnode;
			return true;
		}

		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(newnode);
		newnode.setPrev(last);
		return true;
	}
	
	public void display()
	{
		Node prev=head;
		while(prev!=null)
		{
			System.out.print(" "+prev.getData());
			prev=prev.getNext();
		}
		System.out.println();
	}
	
	public boolean deletebyPosition(int pos)
	{
		if(head==null)
			return false;
		
		if(pos==1)
		{
			head=head.getNext();
			if(head!=null)
			{
				head.setPrev(null);
			}
			return true;
		}
		
		Node del=head;
		for(int i=1;i<pos;i++)
		{
			del=del.getNext();
			if(del==null)
			{
				return false;
			}
		}
		
		del.getPrev().setNext(del.getNext());
		if(del.getNext()!=null)
		{
			del.getNext().setPrev(del.getPrev());
		}
		
		return true;
		
	}
	
	public boolean deleteByvalue(int data)
	{
		if(head==null)
			return false;
		if(head.getData()==data)
		{
			head=head.getNext();
			if(head!=null)
			{
				head.setPrev(null);
			}
			return true;
		}
		Node del=head;
		while(del.getData()!=data)
		{
			del=del.getNext();
			if(del==null)
				return false;
		}
		
		del.getPrev().setNext(del.getNext());
		if(del.getNext()!=null)
		{
			del.getNext().setPrev(del.getPrev());
		}
		return true;
	}
	
	public boolean insert(int data,int pos)
	{
		if(pos<=0 || head==null && pos>1)
			return false;
		
		Node newnode=new Node(data);
		if(newnode==null)
			return false;
		
		if(pos==1)
		{
			if(head!=null)
			{
				newnode.setNext(head);
				head.setPrev(newnode);
			}
			head=newnode;
			return true;
		}
		
		Node prev=head;
		for(int i=1;i<pos-1;i++)
		{
			prev=prev.getNext();
			if(prev==null)
				return false;
		}
		
		newnode.setPrev(prev);
		if(prev.getNext()!=null)
		{
			newnode.setNext(prev.getNext());
			prev.getNext().setPrev(newnode);
		}
		prev.setNext(newnode);
		
		return true;
		
	}
	
	
	
	
}
