package par_autok;

public class convertible extends body   // class of convertible, subclass of body //
{
	protected String pillars;
	
	public convertible (String tpb, String brd, int sln, String date, float l, float h, String p)
	{
		super(tpb, brd, sln, date, l, h);
		this.pillars=p;
	}
	
	public void print ()    // print function //
	{
		System.out.println("\nType:" + this.typeb + "\nBrand:" + this.brand + "\nSerial number:" + this.serialnumber + "\nDate:" + this.date + "\nLength:" + this.length + "\nHight:" + this.hight + "\nPillars:" + this.pillars);
	}

}
