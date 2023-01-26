
public class Tester {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.enQueue(10);
		q.enQueue(5);
		q.enQueue(26);
		q.enQueue(4);
		q.enQueue(17);
//		q.deQueue();
//		q.deQueue();
		q.deQueue();
		q.enQueue(3);
		q.enQueue(6);
		q.enQueue(13);
		q.enQueue(46);
		
		
		q.show();
		System.out.println();
		System.out.println("Size: "+q.getSize());
	}

}
