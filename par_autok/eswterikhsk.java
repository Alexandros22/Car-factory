package par_autok;

public class eswterikhsk extends engine   // class of internal combustion, subclass of engine //
{
	protected String typefuel;
	protected int numberofculibers;
	
	public eswterikhsk (String tpe, String brd, int sln, String date, int hp, String tpf,int noc)
	{
		super(tpe, brd, sln, date, hp);
		this.typefuel=tpf;
		this.numberofculibers=noc;
	}
	
	public void print ()     // print function //
	{
		System.out.println("\nType:" + this.typee + "\nBrand:" + this.brand + "\nSerial number:" + this.serialnumber + "\nDate:" + this.date + "\nType fuel:" + this.typefuel + "\nNumber of culibers:" + this.numberofculibers);
	}

}
