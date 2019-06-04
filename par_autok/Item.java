package par_autok;

public abstract class Item    
{
	protected String brand;
	protected int serialnumber;
	protected String date;
	
	public Item (String brd, int sln, String date)
	{
		this.brand=brd;
		this.serialnumber=sln;
		this.date=date;
	}
	
	public void print(){     // print function which needs for the heredity //
	}
}
