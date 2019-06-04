package par_autok;

public class node         // class of item node //
{
	private Item part;
	private node next;
	
	
	public node (Item p) 
	{
		part = p;
	}
	
	{
		node n=null;
		next=n;
	}
	public void setPart(Item part) {
		this.part = part;
	}
	
	public void setNext(node next) {
		this.next = next;
	}
	public node getNext() {
		return next;
	}
	
	public Item getElem()
	{
		return part;
	}
}
