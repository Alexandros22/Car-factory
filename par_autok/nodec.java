package par_autok;

public class nodec      // class of car node //
{
	private Car part;
	private nodec next;
	
	
	public nodec (Car p) 
	{
		part = p;
	}
	
	{
		nodec n=null;
		next=n;
	}
	public void setPart(Car part) {
		this.part = part;
	}
	
	public void setNext(nodec next) {
		this.next = next;
	}
	public nodec getNext() {
		return next;
	}
	
	public Car getElem()
	{
		return part;
	}

}
