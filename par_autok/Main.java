package par_autok;

import tuc.ece.cs111.util.StandardInputRead;
import java.util.Vector;

public class Main                        
{
	static StandardInputRead sir = new StandardInputRead();
	
	
	public Main(){	
	}
	
	public static body cnb()       // function which creates a body //
	{
		String tpb;
		do
		{
			tpb = sir.readString("\nType body (convertible or cabriolet):");
			if(!tpb.equalsIgnoreCase("convertible") && !tpb.equalsIgnoreCase("cabriolet"))
				System.out.println("\nGive the right type (convertible or cabriolet):");
		}while (!tpb.equalsIgnoreCase("convertible") && !tpb.equalsIgnoreCase("cabriolet"));
		String brd = sir.readString("Brand:");
		int sln = sir.readPositiveInt("Serial number:");
		String date = sir.readString("Date:");
		float l = sir.readPositiveFloat("Length:");
		float h = sir.readPositiveFloat("Hight:");
		if (tpb.equalsIgnoreCase("convertible"))
		{
			String p;
			do
			{
				p = sir.readString("Pillars ((abc) or (ac) or (abcd)):");
				if (!p.equalsIgnoreCase("abc") && !p.equalsIgnoreCase("ac") && !p.equalsIgnoreCase("abcd"))
					System.out.println("\nGive the right type of pillars ((abc) or (ac) or (abcd))");
			}while(!p.equalsIgnoreCase("abc") && !p.equalsIgnoreCase("ac") && !p.equalsIgnoreCase("abcd"));
			convertible b = new convertible(tpb, brd, sln, date, l, h, p);
			return b;
		}
		else
		{
			String tpc;
			do
			{
				tpc = sir.readString("Type cabriolet (folding textile roof (ftr) or retractable hardtop roof (rhr)):");
				if (tpc.equalsIgnoreCase("ftr"))
					tpc = "folding textile roof";
				else if (tpc.equalsIgnoreCase("rhr"))
					tpc = "retractable hardtop roof";
				else 
					System.out.println("\nGive the right type (ftr or rhr)!");
			}while (!tpc.equalsIgnoreCase("folding textile roof") && !tpc.equalsIgnoreCase("retractable hardtop roof"));
			cabriolet b = new cabriolet(tpb, brd, sln, date, l, h, tpc);
			return b;	
		}
	}
	
	public static engine cne()     // function which creates an engine // 
	{
		String tpe;
	
		do
		{
			 tpe = sir.readString("\nType engine (electric or (ek) for eswterikhs kausews):");
			 if (tpe.equalsIgnoreCase("ek"))
				 tpe = "eswterikhs kausews";
			 else if (!tpe.equalsIgnoreCase("electric") && !tpe.equalsIgnoreCase("eswterikhs kausews"))
				 System.out.println("\nGive the right type (electic or (ek))!");
		}while (!tpe.equalsIgnoreCase("electric") && !tpe.equalsIgnoreCase("eswterikhs kausews"));
		String brd = sir.readString("Brand:");
		int sln = sir.readPositiveInt("Serial number:");
		String date = sir.readString("Date:");
		int hp = sir.readPositiveInt("Horsepower:");
		if (tpe.equalsIgnoreCase("electric"))
		{
			String ens;
			do
			{
				ens = sir.readString("Energy source ((res) for rechargable electricity storage or (fc) for fuel cell):");
				if (ens.equalsIgnoreCase("res"))
					ens = "rechargable electricity storage";
				else if (ens.equalsIgnoreCase("fc"))
					ens = "fuel cell";
				else
					System.out.println("\nGive the right type supply (res or fc)!");
			}while (!ens.equalsIgnoreCase("rechargable electricity storage") && !ens.equalsIgnoreCase("fuel cell"));
			electrik e = new electrik(tpe, brd, sln, date, hp, ens);
			return e;	
		}
		else
		{
			String tpf;
			int noc;
			do
			{
				tpf = sir.readString("Type fuel ((g) for gasoline or (d) for diesel or (h) for hydrogen):");
				if (tpf.equalsIgnoreCase("g"))
					tpf = "gasoline";
				else if (tpf.equalsIgnoreCase("d"))
					tpf = "diesel";
				else if(tpf.equalsIgnoreCase("h"))
					tpf = "hydrogen";
				else
					System.out.println("\nGive the right type of fuel ((g) or (d) or(h))!");
			}while (!tpf.equalsIgnoreCase("gasoline") && !tpf.equalsIgnoreCase("diesel") && !tpf.equalsIgnoreCase("hydrogen"));
			do
			{
				noc = sir.readPositiveInt("Number of culibers (4 or 6 or 8):");
				if(noc!=4 && noc!=6 && noc!=8)
					System.out.println("\n Give the right number of culibers!");
			}while (noc!=4 && noc!=6 && noc!=8);
			eswterikhsk e = new eswterikhsk(tpe, brd, sln, date, hp, tpf, noc);
			return e;
		}
	}
	
	public static wheels cnw ()    // function which creates a wheel //
	{
		String brd = sir.readString("\nBrand:");
		int sln = sir.readPositiveInt("Serial number:");
		String date = sir.readString("Date:");
		float p = sir.readPositiveFloat("Width;");
		float y_p = sir.readPositiveFloat("(Hight/Width)*100 of wheel:");
		float d = sir.readPositiveFloat("Diameter:");
		wheels w = new wheels(brd, sln, date, p, y_p, d);
		return w;
	}
	
	public static Car cnc()        // function which creates a car //
	{
		Item am = null, mhx = null;
		Item[] tr = new Item[4];
		for(int i=0; i<4; i++)
			tr[i] = null;
		Car c = new Car(am, mhx, tr);
		return c;
	}
	
	public static void main(String[] args) 
	{
		lines lineb = new lines(), linee = new lines(), linew = new lines(); 
		linec linecar = new linec();
		int nob, noe, now;
		Vector<Car> store = new Vector<Car>(); 
		
		while (true)   // menu function //
		{
			int a = sir.readPositiveInt("\n1.Insert\n2.Car production\n3.Print\n4.Delete\n5.Exit ");
			
			switch (a)
			{
			
			case 1:
			{
				a = sir.readPositiveInt("\n1.Insert bodies\n2.Insert engines\n3.Insert wheels\nOther:Back ");
				
				if (a==1)   // Insert bodies //
				{
					nob = sir.readPositiveInt("\nGive the number of bodies:");
					for(int i=0; i<nob; i++)
						lineb.insert(cnb());
					break;
				}
				else if (a==2)  // Insert engines //
				{
					noe = sir.readPositiveInt("\nGive the number of engines:");
					for(int i=0; i<noe; i++)
						linee.insert(cne());
					break;
				}
				else if (a==3)  // Insert wheels //
				{
					now = sir.readPositiveInt("\nGive the number of wheels:");
					for(int i=0; i<now; i++)
						linew.insert(cnw());
					break;
				}
				else 
					break;
			}
			
			case 2:
			{
				for(int i=0; i<4; i++)      
					linecar.insertc(cnc());      // insert car //
				int m=0, am=0;
				nodec tempc = linecar.head;     // insert first car in production line // 
				nodec tempc2 = linecar.head.getNext();         // insert second car in production line //
				nodec tempc3 = linecar.head.getNext().getNext();	  // insert third car in production line //
				
				if (tempc.getElem().amakswma==null && !lineb.isEmpty())   // input body in first car //
				{
					tempc.getElem().amakswma = lineb.head.getElem();
					lineb.head = lineb.head.getNext();
					lineb.length--;
				}
				else if (lineb.isEmpty() && tempc.getElem().amakswma==null)
				{
					System.out.println("\nThe production line of bodies is empty!");
					break;
				}
				
				if (tempc.getElem().mhxanh==null && !linee.isEmpty())     // input engine in first car //
				{
					tempc.getElem().mhxanh = linee.head.getElem();
					linee.head = linee.head.getNext();
					linee.length--;
				}
				else if (linee.isEmpty() && tempc.getElem().mhxanh==null)
				{
					System.out.println("\nThe production line of engines is empty!");
					break;
				}
				
				if(tempc2.getElem().amakswma==null && !lineb.isEmpty() && am==0)   // input body in second car //
				{
					tempc2.getElem().amakswma = lineb.head.getElem();
					lineb.head = lineb.head.getNext();
					lineb.length--;
				}
				else if (lineb.isEmpty() && tempc2.getElem().amakswma==null && am==0)
				{
					System.out.println("\nThe production line of bodies is empty!");
					am=1;
				}
				
				if (tempc.getElem().troxoi[0]==null && linew.length>=4)        // input wheels in first car //
				{
					for(int i=0; i<4; i++)
					{
						tempc.getElem().troxoi[i] = linew.head.getElem();
						linew.head = linew.head.getNext();
						linew.length--;
					}
				}
				else if(linew.length<4 && tempc.getElem().troxoi[0]==null)
				{
					System.out.println("\nThe production line of wheels is empty or has not 4 wheels!");
					break;
				}
				
				if (tempc2.getElem().mhxanh==null && !linee.isEmpty() && m==0)    // input engine in second car //
				{
					tempc2.getElem().mhxanh = linee.head.getElem();
					linee.head = linee.head.getNext();
					linee.length--;
				}
				else if (linee.isEmpty() && tempc2.getElem().mhxanh==null && m==0)
				{
					System.out.println("\nThe production line of engines is empty!");
					m=1;
				}
				
				if(tempc3.getElem().amakswma==null && !lineb.isEmpty() && am==0)     // input body in third car //
				{
					tempc3.getElem().amakswma = lineb.head.getElem();
					lineb.head = lineb.head.getNext();
					lineb.length--;
				}
				else if (lineb.isEmpty() && tempc3.getElem().amakswma==null && am==0)
				{
					System.out.println("\nThe production line of bodies is empty!");
					am=1;
				}
				
				store.addElement(linecar.head.getElem());         // input the new car in storage //
				System.out.println("\nThe car is complete!");
				linecar.head = linecar.head.getNext();
				linecar.length--;
				
				tempc = linecar.head;                        // the second car goes first in production line //
				tempc2 = linecar.head.getNext();             // the third car goes second in production line //
			    tempc3 = linecar.head.getNext().getNext();    // input the fourth car in production line... //
			    
			    if (tempc.getElem().troxoi[0]==null && linew.length>=4)       // input wheels in second car //
			    {
			    	for(int i=0; i<4; i++)	
			    	{
			    		tempc.getElem().troxoi[i] = linew.head.getElem();
			    		linew.head = linew.head.getNext();
			    		linew.length--;
			    	}
			    }
			    else if (linew.length<4)
			   	{
			   		System.out.println("\nThe production line of wheels is empty or has not 4 wheels!");
			   		break;
			    }
			    
			    if (tempc2.getElem().mhxanh==null && !linee.isEmpty() && m==0)      // input engine in third car //
				{
					((Car)tempc2.getElem()).mhxanh = linee.head.getElem();
					linee.head = linee.head.getNext();
					linee.length--;
				}
			    else if (linee.isEmpty() && m==0)
				{
					System.out.println("\nThe production line of engines is empty!");
					m=1;
				}
			    
			    if(tempc3.getElem().amakswma==null && !lineb.isEmpty() && am==0)      // input body in fourth car //
				{
					tempc3.getElem().amakswma = lineb.head.getElem();
					lineb.head = lineb.head.getNext();
					lineb.length--;
				}
			    else if (lineb.isEmpty() && am==0)
				{
					System.out.println("\nThe production line of bodies is empty!");
					am=1;
				}    
				break;
			}
			
			case 3:       // Print //
			{
				a = sir.readPositiveInt("\n1.Print production line of bodies\n2.Print production line of engines\n3.Print production line of wheels\n4.Print production line of cars\n5.Print complete cars\nOther:Pisw ");
				
				if (a==1)
				{
					if(lineb.isEmpty())
						System.out.println("\nThe production line of bodies is empty!");
					else
					{
						node temp = lineb.head;
						for(int i=0; i<lineb.length; i++)   // print production line of bodies //
						{
							temp.getElem().print();
							if(temp.getNext()!=null)
								temp=temp.getNext();
						}
					}
					break;
				}
				
				else if (a==2)
				{
					if(linee.isEmpty())
						System.out.println("\nThe production line of engines is empty!");
					else
					{
						node temp = linee.head;
						for(int i=0; i<linee.length; i++)   // print production line of engines //
						{
							temp.getElem().print();
							if(temp.getNext()!=null)
								temp=temp.getNext();
						}
					}
					break;
				}
				
				else if(a==3)
				{
					if(linew.isEmpty())
						System.out.println("\nThe production line of wheels is empty!");
					else
					{
						node temp = linew.head;
						for(int i=0; i<linew.length; i++)   // print production line of wheels //
						{
							temp.getElem().print();
							if(temp.getNext()!=null)
								temp=temp.getNext();
						}
					}
					break;
				}
				
				else if(a==4)
				{
					if(linecar.isEmpty())
						System.out.println("\nThe production line of cars is empty!");
					else if (linecar.head.getElem().amakswma==null)
						System.out.println("\nThe production line of cars is empty!");
					else
					{
						nodec temp = linecar.head;
						for(int i=0; i<linecar.length; i++)
						{
							if (temp.getElem().troxoi[0]!=null)  // if the wheels have not input then the car is not in stage 3 //
							{
								System.out.println("\nStage No 3");
								temp.getElem().print();
								if(temp.getNext()!=null)
									temp=temp.getNext();
							}
							else if (temp.getElem().mhxanh!=null)  // if the engine have not input then the car is not in stage 2 //
							{
								System.out.println("\nStage No 2");
								temp.getElem().print();
								if(temp.getNext()!=null)
									temp=temp.getNext();
							}
							else if (temp.getElem().amakswma!=null)  // if the body have not input then the car is not in stage 1 //
							{
								System.out.println("\nStage No 1");
								temp.getElem().print();
								if(temp.getNext()!=null)
									temp=temp.getNext();
							}
						}
					}
					break;
				}
				
				else if(a==5)     // print storage (complete cars) //
				{
					if(store.size()==0)
						System.out.println("\nThe storage is empty!");
					else
					{
						for(int i=0; i<store.size(); i++)
						{
							System.out.println("\nCar No:" + (i+1));
							store.elementAt(i).print();
						}
					}
					break;
				}
				else
					break;
			}
			
			case 4:            // delete //
			{
				a = sir.readPositiveInt("\n1.Delete body\n2.Delete engine\n3.Delete wheel\nOther:Back ");
				
				if (a==1)
				{
					if(lineb.isEmpty())
						System.out.println("\nThe line is empty!");
					else
					{
						int sln = sir.readPositiveInt("\nSerial number:");
						lineb.delete(sln, a);           // reads the serial number and delete the element //
					}
					break;
				}
				
				else if (a==2)
				{
					if(linee.isEmpty())
						System.out.println("\nThe line is empty!");
					else
					{
						int sln = sir.readPositiveInt("\nSerial number:");
						linee.delete(sln, a);
					}
					break;
				}
				
				else if (a==3)
				{
					if(linew.isEmpty())
						System.out.println("\nThe line is empty!");
					else
					{
						int sln = sir.readPositiveInt("\nSerial number:");
						linew.delete(sln, a);
					}
					break;
				}
				else
					break;
			}
			
			case 5:      // exit //
			{
				System.exit(0);
			}
			
			default:
			{
				System.out.println("\nGive the right choice!");
				break;
			}
			
			}
			
		}
		
	}

}
