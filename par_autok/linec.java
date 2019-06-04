package par_autok;

public class linec       // class of produce line //
{
	protected nodec tail;
	protected nodec head;
	protected int length;
	
	public linec ()
	{
		head=null;
		length=0;
	}
	
	public boolean isEmpty()     // function which checks if the list is empty //
	{ 
		return head == null; 
	}
	
	public void insertc (Car p)  // function which inserts a car in list //
	{
		length++;
		if (isEmpty())
			head=tail=new nodec(p);
		else
		{
			tail.setNext(new nodec(p));
		    tail = tail.getNext();  
		}
		
	}
}
