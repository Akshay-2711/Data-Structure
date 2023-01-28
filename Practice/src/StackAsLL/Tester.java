package StackAsLL;

public class Tester {
	
	public static void main(String[] args) {
		
		stack s=new stack();
		s.push(10);
		s.display();
		s.push(11);
		s.display();
		s.push(28);
		s.display();
		s.push(2);
		s.display();
		s.push(15);
		s.display();
		System.out.println();
		System.out.print(s.pop()+" ");
		System.out.print(s.pop()+" ");
		System.out.print(s.pop()+" ");
		System.out.println(s.peek());
		
		
	}
}
