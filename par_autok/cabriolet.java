package par_autok;

public class cabriolet extends body  // class of cabriolet, subclass of body //
{
	protected String typec;
	
	public cabriolet (String tpb, String brd, int sln, String date, float l, float h, String tpc)
	{
		super (tpb, brd, sln, date, l, h);
		this.typec=tpc;
	}
	
	public void print()        // print function //
	{
		System.out.println("\nType:" + this.typeb + "\nBrand:" + this.brand + "\nSerial number:" + this.serialnumber + "\nDate:" + this.date + "\nLength:" + this.length + "\nHight:" + this.hight + "\nCabriolet type:" + this.typec);
	}

}
