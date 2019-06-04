package par_autok;

public class electrik extends engine  // class of electric, subclass of engine //
{
	protected String energysource;
	
	public electrik (String tpe, String brd, int sln, String date, int hp, String ens)
	{
		super(tpe, brd, sln, date, hp);
		this.energysource=ens;
	}
	
	public void print()        // print function //
	{
		System.out.println("\nType:" + this.typee + "\nBrand:" + this.brand + "\nSerial number:" + this.serialnumber + "\nDate:" + this.date + "\nEnergy source:" + this.energysource);
	}

}
