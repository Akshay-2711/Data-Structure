import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		
		Stack s=new Stack(sc.nextInt());
		
		s.push(10);
		s.display();
		s.push(25);
		s.display();
		s.push(12);
		s.display();
//		s.pop();
//		s.display();
//		s.pop();
//		s.display();
		s.peek();
		s.display();
	
		
		
		
	}

}
