package par_autok;


public abstract class engine extends Item   // class of engine, subclass of Item //
{
	protected String typee;
	protected int horsepower;
	
	public engine(String tpe, String brd, int sln, String date, int hp)
	{
		super(brd, sln, date);
		this.typee=tpe;
		this.horsepower=hp;
	}
	
	public void print(){       // print function which needs for the heredity  //
		
	}

}
