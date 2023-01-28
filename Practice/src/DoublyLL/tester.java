package DoublyLL;

public class tester {

	public static void main(String[] args) {
		dll d=new dll();
		d.insert(10);
		d.insert(25);
		d.insert(14);
		d.insert(20);
		d.insert(19);
		d.insert(86);
		d.insert(23);
		d.display();
		
		d.insert(27, 3);
		d.display();
		d.deleteByvalue(19);
		d.display();
		d.deletebyPosition(5);
		d.display();
	}

}
