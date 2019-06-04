package par_autok;


public class wheels extends Item       // class of wheels, subclass of item //
{
	protected float platos;
	protected float ypsos_platos;
	protected float diametros;
	
	public wheels (String brd, int sln, String date, float p, float y_p, float d)
	{
		super(brd, sln, date);
		this.platos=p;
		this.ypsos_platos=y_p;
		this.diametros=d;
	}
	
	public void print()     // print function //
	{
		System.out.println("\nBrand:" + this.brand + "\nSerial number:" + this.serialnumber + "\nDate:" + this.date + "\nWidth:" + this.platos + "\n(Hight/width)*100:" + this.ypsos_platos + "\nDiameter:" + this.diametros);
	}

}
