
public class Stack {

	int arr[];
	int top, size;

	public Stack(int size) {
		
		this.size = size;
		this.top = -1;
		arr=new int[size];
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}
	public boolean isFull()
	{
		if(top==(size-1))
			return true;
		else
			return false;
	}
	
	public boolean push(int ele)
	{
		if(!isFull())
		{
			top=top+1;
			arr[top]=ele;
			return true;
		}
		
		return false;
		
	}
	
	public int pop()
	{
		if(!isEmpty())
		{
			int temp=arr[top];
			top=top-1;
			System.out.println("popped element "+temp);
			return temp;
			
		}
		else
			return -999;
	}
	
	public int peek()
	{
		if(!isFull())
		{
			int temp;
			temp=arr[top];
			return temp;
		}
		
		return -999;
			
	}
	
	public void display()
	{
		
		System.out.println(" "+arr[top]);
	}

	
	
	
	
}
