package par_autok;

public class lines        // class of the list - tails of every element //
{
	protected node tail;
	protected node head;
	protected int length;
	
	public lines ()
	{
		head=null;
		length=0;
	}
	
	public boolean isEmpty()   //  function which checks if the list is empty //
	{ 
		return head == null; 
	}
	
	public void insert (Item p)   // function which inserts a item in list //
	{
		length++;
		if (isEmpty())
			head=tail=new node(p);
		else
		{
			tail.setNext(new node(p));
		    tail = tail.getNext();  
		}
		
	}
	
	public void delete (int a, int t)   // function which deletes a element from the list //
	{
	    node n1 = head; 
	    node n2 = head;
	    
	    
	    	while ((n1 != null) && (a!=n1.getElem().serialnumber))   // finds the element from the serial number, suppose that number unique //
	    	{ 
	    		if(head.getNext()==null)
	    		{
	    			head=null;
	    		}
	    		else
	    		{
	    			n2 = n1; 
	    			n1 = n1.getNext(); 
	    		}
	    	}
	    	if (n1!=null)      // if found it, delete that from the list //
	    	{     
	        	length--;
	        	if (n2 != n1)       
	            	n2.setNext(n1.getNext());
	        	else                 
	            	head = head.getNext();     
	        	n1.setNext(null);
	    	}
	    	else
	    	{
	    		System.out.println("\nThere is not such object!");
	    	}
	  }
}
