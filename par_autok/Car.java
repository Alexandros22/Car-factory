package par_autok;

public class Car   
{
	protected Item amakswma, mhxanh;
	protected Item[] troxoi = new Item[4];

	public Car(Item am, Item mhx,  Item[] tr)
	{
		this.amakswma=am;
		this.mhxanh=mhx;
		this.troxoi=tr;
	}
	
	public void print()  // car print function //
	{
		if (amakswma!=null)
		{
			System.out.println("\nBody:");
			amakswma.print();
		}	
		if (mhxanh!=null)
		{
			System.out.println("\nEngine:");
			mhxanh.print();
		}
		for(int i=0; i<4; i++)
		{
			if (troxoi[i]!=null)
			{
				System.out.println("\nWheels:");
				troxoi[i].print();
			}
		}
	}
}
