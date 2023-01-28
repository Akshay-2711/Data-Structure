package LinkedList;

public class Tester 
{
	public static void main(String args[]) 
	{
		LinkedLi l1=new LinkedLi();
		
		l1.insert(10);
		l1.display();
		l1.insert(25);
		l1.display();
		l1.insert(30);
		l1.display();
		l1.insert(40);
		l1.display();
		l1.insert(55);
		l1.display();
		l1.insert(90);
		l1.display();
		
		System.out.println("----------");
		
		l1.insertAtPos(27, 4);
		l1.display();
		l1.insertAtPos(111, 5);
		l1.display();
		l1.insertAtPos(23, 1);
		l1.display();
		l1.insertAtPos(36, 6);
		l1.display();
		
		System.out.println("----------");
		
		l1.deleteByPos(2);
		l1.display();
		l1.deleteByPos(5);
		l1.display();
		l1.deleteByPos(3);
		l1.display();
		
		System.out.println("----------");
		
		l1.deleteByValue(25);
		l1.display();
		l1.deleteByValue(55);
		l1.display();
		l1.deleteByValue(10);
		l1.display();
		
		l1.search(l1.getHead(),45);
		System.out.println(l1.getcount());
		
		
		
		
	}
	
}
