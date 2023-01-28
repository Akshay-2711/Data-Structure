package LinkedList;

public class LinkedLi {
	private Node head;

	public LinkedLi() {
		this.head = null;
	}

	public boolean insert(int data) {
		Node newnode = new Node(data);
		if (newnode == null) {
			return false;
		}
		if (head == null) {
			head = newnode;
			return true;
		}

		// for last node
		Node lastnode = head;
		while (lastnode.getNext() != null) {
			lastnode = lastnode.getNext();
		}
		lastnode.setNext(newnode);
		return true;

	}

	public void display() {
		Node last = head;
		while (last != null) {
			System.out.print(last.getData() + " ");
			last = last.getNext();
		}
		System.out.println();

	}

	public boolean insertAtPos(int data, int pos) {
		if (pos <= 0 || head == null && pos > 1)
			return false;
		Node newNode = new Node(data);
		if (newNode == null)
			return false;

		if (pos == 1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}

		Node prev = head;
		for (int i = 1; i < pos - 1; i++) {
			prev = prev.getNext();
			if (prev == null)
				return false;
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;

	}

	public boolean deleteByPos(int pos) {
		if (pos <= 0 || head == null)
			return false;

		if (pos == 1) {
			head = head.getNext();
			return true;
		}

		Node del = head;
		for (int i = 1; i < pos - 1; i++) {
			del = del.getNext();
			if (del.getNext() == null)
				return false;
		}
		del.setNext(del.getNext().getNext());

		return true;

	}

	public boolean deleteByValue(int data) {
		if (head == null)
			return false;

		if (head.getData() == data) {
			head = head.getNext();
			return true;
		}

		Node prev = head, del = head;
		while (del.getData() != data) {
			prev = del;
			del = del.getNext();
			if (del == null)
				return false;
		}

		prev.setNext(del.getNext());
		return true;

	}
	//search element in linkedlist
	public boolean search(Node head,int data)
	{
		Node temp=head;
		while(temp!=null)
		{
			if(temp.getData()==data)
			{
				System.out.println("data found "+data);
				return true;
			}
			temp=temp.getNext();
		}
		return false;
	}
	//count the number of nodes in a linkedlist
	public int getcount()
	{
		Node temp=head;
		int cnt=0;
		while(temp!=null)
		{
			cnt++;
			temp=temp.getNext();
		}
		return cnt;
	}

	public Node getHead() {
		return head;
	}

}