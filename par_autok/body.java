package par_autok;


public abstract class body extends Item   // class of body, subclass of Item //
{
	protected String typeb;
	protected float length;
	protected float hight;
	
	public body (String tpb, String brd, int sln, String date, float l, float h)
	{
		super(brd, sln, date);
		this.typeb=tpb;
		this.length=l;
		this.hight=h;
	}
	
	
	public void print(){              // print function which needs for the heredity //
		}

}
